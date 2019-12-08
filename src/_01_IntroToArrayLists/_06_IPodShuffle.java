package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
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

public class _06_IPodShuffle implements ActionListener {
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
		Surprise.addActionListener(this);
		panel.add(Surprise);
		Stop = new JButton("Stop All");
		Stop.addActionListener(this);
		panel.add(Stop);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	private void loadSongs() {
		songs.add(new Song(null));
		songs.add(new Song(null));
		songs.add(new Song(null));
		songs.add(new Song(null));
		songs.add(new Song(null));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(Surprise)) {
			
		}
	}
	
		
		}
		class Song {

			private int duration;
			private String songAddress;
			private ImageInputStream songStream;
			public Song(String string) {
				// TODO Auto-generated constructor stub
			}
			public void play() {
				// TODO Auto-generated method stub
				
			}

	/**
	 * 2. Congratulations on completing the sound check! * Now we want to make an
	 * iPod Shuffle that plays random music. * Create an ArrayList of Songs and a
	 * "Surprise Me!" button that will play a random song when it is clicked. * If
	 * you're really cool, you can stop all the songs, before playing a new one on
	 * subsequent button clicks.
	 */

		
		}
	
