package com.java.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class SortSongs {
	
	public static void main(String[] args) {
		
		String[] genres = {"classic", "pop", "classic", "classic", "pop"};
		int[] plays = {500, 600, 150, 800, 2500};
		
//		String[] genres = {"classic"};
//		int[] plays = {100};
		
		Map<Integer, String> genreOfNumMap = new HashMap<Integer, String>();
		Map<Integer, Integer> playsOfNumMap = new HashMap<Integer, Integer>();
		Set<String> genreSet = new HashSet<String>();
        
        for(int i = 0; i < genres.length; ++i) {
        	genreOfNumMap.put(i, genres[i]);
        	playsOfNumMap.put(i, plays[i]);
        	genreSet.add(genres[i]);
        }
        
        Map<Integer, String> totalPlaysOfGenreMap = new HashMap<Integer, String>();
        Iterator<String> genreItr = genreSet.iterator();
        while(genreItr.hasNext()) {
        	int sum = 0;
        	String genre = genreItr.next();
        	for(int i = 0; i < genreOfNumMap.size(); ++i) {
        		if(genreOfNumMap.get(i).equals(genre)) {
        			sum += playsOfNumMap.get(i);
        		}
        	}
        	
        	totalPlaysOfGenreMap.put(sum, genre);
        }
        
        Map<Integer, String> sortPlaysAsc = new TreeMap<Integer, String>(totalPlaysOfGenreMap);
        String[] sortGenreDesc = new String[sortPlaysAsc.size()];
        int index = 0;
        for(int play : sortPlaysAsc.keySet()) {
        	sortGenreDesc[sortPlaysAsc.size() - 1 - index] = sortPlaysAsc.get(play);
        	index++;
        }
        
        List<Integer> songList = new ArrayList<Integer>();
        
        for(int i = 0; i < sortGenreDesc.length; ++i) {
        	List<Integer> playsList = new ArrayList<Integer>();
        	for(int x = 0; x < genreOfNumMap.size(); ++x) {
        		if(genreOfNumMap.get(x).equals(sortGenreDesc[i])) {
        			playsList.add(playsOfNumMap.get(x));
        		}
        	}
        	
        	Collections.sort(playsList);
        	
        	System.out.println(playsList.toString());
        	
        	for(int x = 0; x < 2; ++x) {
        		if(playsList.size() == 1 && x == 1) break;
	        	for(int y = 0; y < playsOfNumMap.size(); ++y) {
	        		if(playsOfNumMap.get(y) == playsList.get(playsList.size() - 1 - x)) {
	        			playsOfNumMap.remove(y);
	        			songList.add(y);
	        			break;
	        		}
	        	}
        	}
        }
        
        System.out.println(songList.toString());
        
        int[] arrSong = new int[songList.size()];
        for(int i = 0; i < arrSong.length; ++i) {
        	arrSong[i] = songList.get(i);
        }
        
//		
//        for(int i = 0; i < genres.length; ++i) {
//        	List<Integer> playsList = songMap.get(genres[i]);
//        	if(playsList == null) {
//        		songMap.put(genres[i], new ArrayList<Integer>());
//        		songMap.get(genres[i]).add(plays[i]);
//        	} else {
//        		if(playsList.size() > 2) {
//        			for(int x = 0; x < playsList.size(); ++x) {
//        				if(plays[i] > playsList.get(x)) {
//        					playsList.set(x, plays[i]);
//        					break;
//        				}
//        			}
//        		} else {
//        			playsList.add(plays[i]);
//        		}
//        	}
//        	
//        }
//		
	}

}
