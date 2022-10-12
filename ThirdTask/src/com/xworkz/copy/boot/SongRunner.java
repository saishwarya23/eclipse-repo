package com.xworkz.copy.boot;

import com.xworkz.copy.things.Song;

public class SongRunner {

	public static void main(String[] args) {
		
		
		Song songData=new Song();
		
		
		System.out.println(songData.name);
		System.out.println(songData.language);
		System.out.println(songData.singer);
		System.out.println(songData.lyricst);
		System.out.println(songData.type);
		
		songData.name="E bhoomi bannada bugari";
		songData.language="Kannada";
		songData.singer="S.P Balasubramanyam";
		songData.lyricst="Hamsalekha";
		songData.type="Motivational Song";
		
		System.out.println(songData.name);
		System.out.println(songData.language);
		System.out.println(songData.singer);
		System.out.println(songData.lyricst);
		System.out.println(songData.type);
		
	}

}
