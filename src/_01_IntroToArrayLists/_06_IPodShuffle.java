package _01_IntroToArrayLists;

import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.imageio.stream.ImageInputStream;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//import src.org.jointheleague.stephenh.level3project.ActionEvent;
//import src.org.jointheleague.stephenh.level3project.AdvancedPlayer;
//import src.org.jointheleague.stephenh.level3project.InputStream;
//import src.org.jointheleague.stephenh.level3project.Random;
//import src.org.jointheleague.stephenh.level3project.Song;

//import src.org.jointheleague.stephenh.level3project.JFrame;
//import src.org.jointheleague.stephenh.level3project.Override;

//Copyright The League of Amazing Programmers, 2015
@SuppressWarnings("serial")

public class _06_IPodShuffle {
	//public <JFrame> _06_IPodShuffle() {
		// 1. Use the Song class the play the demo.mp3 file.
		ArrayList<Song> songs = new ArrayList<Song>();
		JButton Surprise;
		JButton Stop;

	//}

	public static void main(String[] args) {
		Song aSong = new Song("http://www.youtube-mp3.org/get?"
				+ "ab=128&video_id=JuYeHPFR3f0&h=7a4c6a17d1895c021c434429859feaa0&r=1422754756900.1436681755&s=101948");
		aSong.play();
		new _06_IPodShuffle().run();
	}

	public void run() {
		JFrame frame = new JFrame("iPod Shuffle");
		JPanel panel = new JPanel();
		frame.add(panel);
		loadSongs();
		Surprise = new JButton("Surprise Me!");
		Surprise.addActionListener((ActionListener) this);
		panel.add(Surprise);
		Stop = new JButton("Stop All");
		Stop.addActionListener((ActionListener) this);
		panel.add(Stop);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	private void loadSongs() {
		songs.add(new Song("http://www.youtube-mp3.org/get?"
				+ "ab=128&video_id=JuYeHPFR3f0&h=7a4c6a17d1895c021c434429859feaa0&r=1422754756900.1436681755&s=101948"));
		songs.add(new Song("http://www.youtube-mp3.org/get?"
				+ "ab=128&video_id=sTSA_sWGM44&h=e08d5d904bc9132e3dd1a0e8cf510918&r=1422754933225.1455097378&s=159877"));
		songs.add(new Song("http://www.youtube-mp3.org/get?"
				+ "ab=128&video_id=wELMFhuQHXU&h=fb9de95bc878199eee3007837fbbd522&r=1422755320117.1502479959&s=175645"));
		songs.add(new Song("http://www.youtube-mp3.org/get?"
				+ "ab=128&video_id=Y3x8PjIuTxU&h=ed1f725c508ba2a00d7e4963c7ac3d0d&r=1422755582874.1515783810&s=3364"));
		songs.add(new Song("http://www.youtube-mp3.org/get?"
				+ "ab=128&video_id=aUHEH48xCpk&h=4f017a9915f0605625ef8a5c256111ef&r=1422755959635.1429931581&s=33875"));
	}
	public <AdvancedPlayer> void actionPerformed(Action arg0) {
		for (Song song2Stop : songs) {
			song2Stop.stop();
		}
		if (((Object) arg0).getSource() == Surprise) {
			Song aSong = songs.get(new java.util.Random().nextInt(songs.size()));
			aSong.play();
		}
		class Song {

			private int duration;
			private String songAddress;
			private AdvancedPlayer mp3Player;
			private ImageInputStream songStream;

	/**
	 * 2. Congratulations on completing the sound check! * Now we want to make an
	 * iPod Shuffle that plays random music. * Create an ArrayList of Songs and a
	 * "Surprise Me!" button that will play a random song when it is clicked. * If
	 * you're really cool, you can stop all the songs, before playing a new one on
	 * subsequent button clicks.
	 */

		}
		}
	}
