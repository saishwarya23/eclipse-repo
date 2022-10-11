package com.xworkz.copy.boot;

import com.xworkz.copy.things.Song;

public class SongRunner {

	public static void main(String[] args) {
		
		
		Song songName=new Song();
		Song lang=new Song();
		Song singerName=new Song();
		Song lyricstName=new Song();
		Song songType=new Song();
		
		System.out.println(songName.name);
		System.out.println(lang.language);
		System.out.println(singerName.singer);
		System.out.println(lyricstName.lyricst);
		System.out.println(songType.type);
		
		songName.name="E bhoomi bannada bugari";
		lang.language="Kannada";
		singerName.singer="S.P Balasubramanyam";
		lyricstName.lyricst="Hamsalekha";
		songType.type="Motivational Song";
		
		System.out.println(songName.name);
		System.out.println(lang.language);
		System.out.println(singerName.singer);
		System.out.println(lyricstName.lyricst);
		System.out.println(songType.type);
		
		
		

	}

}
