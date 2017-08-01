package com.example.bliss_000.recyclerviewtesting;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

/**
 * Created by bliss_000 on 7/30/2017.
 */

public class Post {

    private String message;
    private String user;
    private String imageURL;
    private boolean hasContent;
    private String profileImageURL;
    private String date;
    private boolean firebase;

    public Post(String mess, String dat, String use, String imageU, boolean hasCont, String proPic, boolean fromFirebase){

        message = mess;
        date = dat;
        user = use;
        imageURL = imageU;
        hasContent = hasCont;
        profileImageURL = proPic;
        firebase = fromFirebase;

    }

    public String getDate(){
        return date;
    }
    public String getMessage(){
        return message;
    }
    public String getUser(){
        return user;
    }
    public String getImageURL(){
        return imageURL;
    }
    public boolean getHasContent(){
        return hasContent;
    }
    public String getProfileImageURL(){
        return profileImageURL;
    }
    public boolean isFirebase(){
        return firebase;
    }

    public static ArrayList<Post> createPostsList(){

        ArrayList<Post> postArrayList = new ArrayList<Post>();

        String longmess = "Hello. This is senator Jeff Sessions here to talk to you good citizens about the dangers of pedophilia in our urban neighborhoods. I sincerely apologize for all the recent happenings but I promise you and the proud families that are the pillars for our great country and government that we will do all in our power to stop this crisis. Whether it be night or day, we will work tirelessly to end this terrible pandemic.";

        Post post1 = new Post(
                longmess,
                "July 4, 2017",
                "National Geographic Channel",
                "http://az616578.vo.msecnd.net/files/2016/07/23/6360489455192162291563850737_Trump.jpg",
                true,
                "http://www.american.edu/uploads/profiles/large/chris_palmer_profile_11.jpg",
                false
        );

        Post post2 = new Post(
                "Shout out to all LGBT. Our prayers are with Manchester.",
                "July 7, 2017",
                "Coldplay",
                "https://www.nubimagazine.com/wp-content/uploads/2015/11/Coldplay-feat.jpg",
                true,
                "http://www.aceshowbiz.com/images/photo/coldplay.jpg",
                false
        );

        postArrayList.add(post1);
        postArrayList.add(post2);

        return postArrayList;
    }



}
