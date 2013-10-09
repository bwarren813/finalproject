/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.titanmusicplayer.dal;

import com.titanmusicplayer.bll.Library;
import musicPlayerDB.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class LibraryRepository {
    
    private static Session session;
    private static HibernateUtil helper;
    
    public static void addSong(String Title, String Artist) {
        session = helper.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        musicPlayerDB.entity.Song song = new musicPlayerDB.entity.Song();
        song.setTitle(Title);
        song.setArtist(Artist);
        session.save(song);
        tx.commit();
        session.close();
    }
    
    public static String getSongTitle(int id) {
        session = helper.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        musicPlayerDB.entity.Song song = new musicPlayerDB.entity.Song();
        song = (musicPlayerDB.entity.Song) session.get(musicPlayerDB.entity.Song.class, id);
        return song.getTitle();
    }
    
}
