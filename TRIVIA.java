// The "TRIVIA" class.
import java.awt.*;
import java.awt.event.*;  // for listening to buttons
import javax.swing.*;
import java.applet.*;
import java.net.*;
import java.io.*;
public class TRIVIA extends JFrame implements ActionListener
{
    // Declare class variables for  buttons
    // and variables to be used throughout the class
    public ImageIcon backGnd;
    public String name[] = new String [5];
    public String name2[] = new String [1];
    public int score[] = new int [5];
    public int score2[] = new int [1];
    public int highscore = 0;
    public String lineOfTextRead[] = new String [5];



    Button btnStart, btnClear, btnMath, btnSci, btnGeo, btnM1, btnM2, btnM3, btnM4, btnS1, btnS2, btnS3, btnS4, btnM5, btnM6, btnM7, btnM8, btnM9, btnM10, btnM12, btnM11, btnM13, btnM14, btnM15, btnM16, btnM17, btnM18, btnM19, btnM20, btnS5, btnS6, btnS7, btnS8, btnS9, btnS10, btnS11, btnS12, btnS13, btnS14, btnS15, btnS16, btnS17, btnS18, btnS19, btnS20, btnScore, btnHScore;

    AudioClip ac;
    Container frame;
    TextField txtOutput, txtOutput2, txtOutput3, txtOutput4, txtOutput5; // declare the container frame

    public TRIVIA ()
    {

	super ("Welcome To Trivia ");        // Set the frame's name
	frame = getContentPane ();  // get the container frame
	Toolkit image = Toolkit.getDefaultToolkit (); //get images
	backGnd = new ImageIcon (image.getImage ("back1.gif"));

	//playing music
	URL path = getClass ().getResource ("music.wav");   //open the file
	ac = Applet.newAudioClip (path);   //create audio clip
	ac.play ();

	// Create  buttons
	btnStart = new Button ("Begin Quiz");
	btnScore = new Button ("View Your Score");
	btnHScore = new Button ("View High Scores");
	btnClear = new Button ("Exit");
	btnMath = new Button ("Begin Math Quiz");
	btnM1 = new Button (" 12");
	btnM3 = new Button (" 11.5 ");
	btnM4 = new Button (" 7 ");
	btnM2 = new Button (" 8 ");
	btnM5 = new Button (" 6 ");
	btnM6 = new Button (" 16 ");
	btnM7 = new Button (" 8 ");
	btnM8 = new Button (" 20 ");
	btnM9 = new Button (" -6 ");
	btnM10 = new Button (" -16 ");
	btnM11 = new Button (" 10 ");
	btnM12 = new Button (" -5 ");
	btnM13 = new Button (" 8 ");
	btnM14 = new Button (" 6 ");
	btnM15 = new Button (" -3 ");
	btnM16 = new Button (" -9 ");
	btnM17 = new Button (" 2 ");
	btnM18 = new Button (" 0 ");
	btnM19 = new Button (" 1 ");
	btnM20 = new Button (" 4 ");
	btnS1 = new Button (" Meat Eaters ");
	btnS3 = new Button (" Plant Eaters ");
	btnS4 = new Button (" None of the above ");
	btnS2 = new Button (" Omnivores ");
	btnS5 = new Button ("1900");
	btnS6 = new Button (" 1867");
	btnS7 = new Button (" 1907 ");
	btnS8 = new Button ("  1879 ");
	btnS9 = new Button ("Eye Galaxy");
	btnS10 = new Button ("Milky path Galaxy");
	btnS11 = new Button (" Milky Way Galaxy ");
	btnS12 = new Button (" The Galaxy ");
	btnS13 = new Button ("Hen");
	btnS14 = new Button ("Mosquitoes");
	btnS15 = new Button (" Bumble Bee Bat");
	btnS16 = new Button ("  Dwarf Bees ");
	btnS17 = new Button ("1^3 + 1 ");
	btnS18 = new Button ("1.989 × 10^30 kg");
	btnS19 = new Button (" 5.972 × 10^24 kg");
	btnS20 = new Button ("  1.898 × 10^27 kg ");
	btnSci = new Button ("Begin Science Quiz");
	
	// set the size and layout of the applet
	frame.setLayout (null);

	// add the labels, textboxes and buttons
	frame.add (btnClear);
	frame.add (btnM1);
	frame.add (btnM2);
	frame.add (btnM3);
	frame.add (btnM4);
	frame.add (btnS1);
	frame.add (btnS2);
	frame.add (btnS3);
	frame.add (btnS4);
	frame.add (btnMath);
	frame.add (btnM5);
	frame.add (btnM6);
	frame.add (btnM7);
	frame.add (btnM8);
	frame.add (btnM9);
	frame.add (btnM10);
	frame.add (btnM11);
	frame.add (btnM12);
	frame.add (btnM13);
	frame.add (btnM14);
	frame.add (btnM15);
	frame.add (btnM16);
	frame.add (btnM17);
	frame.add (btnM18);
	frame.add (btnM19);
	frame.add (btnM20);
	frame.add (btnS5);
	frame.add (btnS6);
	frame.add (btnS7);
	frame.add (btnS8);
	frame.add (btnS9);
	frame.add (btnS10);
	frame.add (btnS11);
	frame.add (btnS12);
	frame.add (btnS13);
	frame.add (btnS14);
	frame.add (btnS15);
	frame.add (btnS16);
	frame.add (btnS17);
	frame.add (btnS18);
	frame.add (btnS19);
	frame.add (btnS20);
	frame.add (btnSci);
	frame.add (btnScore);
	frame.add (btnHScore);
	// make the buttons listen to clicks on this application
	btnMath.addActionListener (this);
	btnM1.addActionListener (this);
	btnM2.addActionListener (this);
	btnM3.addActionListener (this);
	btnM4.addActionListener (this);
	btnM5.addActionListener (this);
	btnM6.addActionListener (this);
	btnM7.addActionListener (this);
	btnM8.addActionListener (this);
	btnM9.addActionListener (this);
	btnM10.addActionListener (this);
	btnM11.addActionListener (this);
	btnM12.addActionListener (this);
	btnM13.addActionListener (this);
	btnM14.addActionListener (this);
	btnM15.addActionListener (this);
	btnM16.addActionListener (this);
	btnM17.addActionListener (this);
	btnM18.addActionListener (this);
	btnM19.addActionListener (this);
	btnM20.addActionListener (this);
	btnSci.addActionListener (this);
	btnS1.addActionListener (this);
	btnS2.addActionListener (this);
	btnS3.addActionListener (this);
	btnS4.addActionListener (this);
	btnS5.addActionListener (this);
	btnS6.addActionListener (this);
	btnS7.addActionListener (this);
	btnS8.addActionListener (this);
	btnS9.addActionListener (this);
	btnS10.addActionListener (this);
	btnS11.addActionListener (this);
	btnS12.addActionListener (this);
	btnS13.addActionListener (this);
	btnS14.addActionListener (this);
	btnS15.addActionListener (this);
	btnS16.addActionListener (this);
	btnS17.addActionListener (this);
	btnS18.addActionListener (this);
	btnS19.addActionListener (this);
	btnS20.addActionListener (this);
	btnClear.addActionListener (this);
	btnScore.addActionListener (this);
	btnHScore.addActionListener (this);

	//area where button is displayed
	btnMath.setBounds (200, 150, 100, 40);
	btnM1.setBounds (195, 150, 100, 25);
	btnM2.setBounds (195, 250, 100, 25);
	btnM3.setBounds (195, 350, 100, 25);
	btnM4.setBounds (195, 450, 100, 25);
	btnM5.setBounds (195, 150, 100, 25);
	btnM6.setBounds (195, 250, 100, 25);
	btnM7.setBounds (195, 350, 100, 25);
	btnM8.setBounds (195, 450, 100, 25);
	btnM9.setBounds (195, 150, 100, 25);
	btnM10.setBounds (195, 250, 100, 25);
	btnM11.setBounds (195, 350, 100, 25);
	btnM12.setBounds (195, 450, 100, 25);
	btnM13.setBounds (195, 150, 100, 25);
	btnM14.setBounds (195, 250, 100, 25);
	btnM15.setBounds (195, 350, 100, 25);
	btnM16.setBounds (195, 450, 100, 25);
	btnM17.setBounds (195, 150, 100, 25);
	btnM18.setBounds (195, 250, 100, 25);
	btnM19.setBounds (195, 350, 100, 25);
	btnM20.setBounds (195, 450, 100, 25);
	btnSci.setBounds (192, 300, 115, 40);
	btnS1.setBounds (195, 150, 100, 25);
	btnS2.setBounds (195, 250, 100, 25);
	btnS3.setBounds (195, 350, 100, 25);
	btnS4.setBounds (195, 450, 110, 25);
	btnS5.setBounds (195, 150, 100, 25);
	btnS6.setBounds (195, 250, 100, 25);
	btnS7.setBounds (195, 350, 100, 25);
	btnS8.setBounds (195, 450, 110, 25);
	btnS9.setBounds (195, 150, 100, 25);
	btnS10.setBounds (195, 250, 100, 25);
	btnS11.setBounds (195, 350, 100, 25);
	btnS12.setBounds (195, 450, 110, 25);
	btnS13.setBounds (195, 150, 100, 25);
	btnS14.setBounds (195, 250, 100, 25);
	btnS15.setBounds (195, 350, 100, 25);
	btnS16.setBounds (195, 450, 110, 25);
	btnS17.setBounds (195, 150, 100, 25);
	btnS18.setBounds (195, 250, 100, 25);
	btnS19.setBounds (195, 350, 100, 25);
	btnS20.setBounds (195, 450, 110, 25);
	btnScore.setBounds (40, 540, 110, 30);
	btnHScore.setBounds (330, 540, 110, 30);
	btnClear.setBounds (200, 540, 90, 30);
	//displaying or not
	btnM1.setVisible (false);
	btnM2.setVisible (false);
	btnM3.setVisible (false);
	btnM4.setVisible (false);
	btnM5.setVisible (false);
	btnM6.setVisible (false);
	btnM7.setVisible (false);
	btnM8.setVisible (false);
	btnM9.setVisible (false);
	btnM10.setVisible (false);
	btnM11.setVisible (false);
	btnM12.setVisible (false);
	btnM13.setVisible (false);
	btnM14.setVisible (false);
	btnM15.setVisible (false);
	btnM16.setVisible (false);
	btnM17.setVisible (false);
	btnM18.setVisible (false);
	btnM19.setVisible (false);
	btnM20.setVisible (false);
	btnS1.setVisible (false);
	btnS2.setVisible (false);
	btnS3.setVisible (false);
	btnS4.setVisible (false);
	btnS5.setVisible (false);
	btnS6.setVisible (false);
	btnS7.setVisible (false);
	btnS8.setVisible (false);
	btnS9.setVisible (false);
	btnS10.setVisible (false);
	btnS11.setVisible (false);
	btnS12.setVisible (false);
	btnS13.setVisible (false);
	btnS14.setVisible (false);
	btnS15.setVisible (false);
	btnS16.setVisible (false);
	btnS17.setVisible (false);
	btnS18.setVisible (false);
	btnS19.setVisible (false);
	btnS20.setVisible (false);
	btnScore.setVisible (true);
	btnHScore.setVisible (true);


	setSize (508, 625);    // Set the frame's size
	setVisible (true);  // Show it.

	//asks for name
	for (int y = 0 ; y < 1 ; y++)
	{

	    name2 [y] = JOptionPane.showInputDialog ("What is your name?");
	}

    } // Constructor


    public void actionPerformed (ActionEvent e)
    {


	// check which button was clicked
	if (e.getSource () == btnMath)

	    {
		try
		{
		    FileReader file = new FileReader ("Questions.txt");
		    BufferedReader input = new BufferedReader (file);

		    String qstn[] = new String [1];
		    for (int i = 0 ; i < qstn.length ; i++)
		    {
			qstn [i] = input.readLine ();


			txtOutput = new TextField (qstn [i]);
		    }
		    input.close ();


		    btnSci.setVisible (false);
		    repaint ();
		    btnMath.setVisible (false);
		    repaint ();

		    frame.add (txtOutput);
		    txtOutput.setBounds (100, 80, 300, 20);
		    repaint ();

		    btnM1.setVisible (true);
		    btnM2.setVisible (true);
		    btnM3.setVisible (true);
		    btnM4.setVisible (true);

		}
		catch (Exception r)
		{
		}


	    }



	else if (e.getSource () == btnM2)
	{

	    JOptionPane.showMessageDialog (null, "Wrong answer "); //wrong answer
	    try
	    {
		FileReader file = new FileReader ("Questions.txt");
		BufferedReader input = new BufferedReader (file);

		String qstn[] = new String [1];
		String qstn2[] = new String [1];

		for (int i = 0 ; i < qstn.length ; i++)
		{
		    qstn [i] = input.readLine ();
		    qstn2 [i] = input.readLine ();



		    txtOutput2 = new TextField (qstn2 [i]);
		}
		input.close ();
		txtOutput.setVisible (false);
		frame.add (txtOutput2);
		txtOutput2.setBounds (100, 80, 300, 20);
		repaint ();

		btnSci.setVisible (false);
		repaint ();
		btnMath.setVisible (false);
		repaint ();
		btnM1.setVisible (false);
		btnM2.setVisible (false);
		btnM3.setVisible (false);
		btnM4.setVisible (false);
		btnM5.setVisible (true);
		btnM6.setVisible (true);
		btnM7.setVisible (true);
		btnM8.setVisible (true);

	    }


	    catch (Exception r)
	    {
	    }



	}
	else if (e.getSource () == btnM1)
	{

	    JOptionPane.showMessageDialog (null, "That's right!"); //right answer
	    highscore++;
	    try
	    {
		FileReader file = new FileReader ("Questions.txt");
		BufferedReader input = new BufferedReader (file);

		String qstn[] = new String [1];
		String qstn2[] = new String [1];

		for (int i = 0 ; i < qstn.length ; i++)
		{
		    qstn [i] = input.readLine ();
		    qstn2 [i] = input.readLine ();



		    txtOutput2 = new TextField (qstn2 [i]);
		}
		input.close ();
		txtOutput.setVisible (false);
		frame.add (txtOutput2);
		txtOutput2.setBounds (100, 80, 300, 20);
		repaint ();

		btnSci.setVisible (false);
		repaint ();
		btnMath.setVisible (false);
		repaint ();
		btnM1.setVisible (false);
		btnM2.setVisible (false);
		btnM3.setVisible (false);
		btnM4.setVisible (false);
		btnM5.setVisible (true);
		btnM6.setVisible (true);
		btnM7.setVisible (true);
		btnM8.setVisible (true);



	    }


	    catch (Exception r)
	    {
	    }

	}
	else if (e.getSource () == btnM3)
	{

	    JOptionPane.showMessageDialog (null, "Wrong answer "); //wrong answer
	    try
	    {
		FileReader file = new FileReader ("Questions.txt");
		BufferedReader input = new BufferedReader (file);

		String qstn[] = new String [1];
		String qstn2[] = new String [1];

		for (int i = 0 ; i < qstn.length ; i++)
		{
		    qstn [i] = input.readLine ();
		    qstn2 [i] = input.readLine ();



		    txtOutput2 = new TextField (qstn2 [i]);
		}
		input.close ();
		txtOutput.setVisible (false);
		frame.add (txtOutput2);
		txtOutput2.setBounds (100, 80, 300, 20);
		repaint ();

		btnSci.setVisible (false);
		repaint ();
		btnMath.setVisible (false);
		repaint ();
		btnM1.setVisible (false);
		btnM2.setVisible (false);
		btnM3.setVisible (false);
		btnM4.setVisible (false);
		btnM5.setVisible (true);
		btnM6.setVisible (true);
		btnM7.setVisible (true);
		btnM8.setVisible (true);









	    }


	    catch (Exception r)
	    {
	    }

	}
	else if (e.getSource () == btnM4)
	{

	    JOptionPane.showMessageDialog (null, "Wrong answer "); //wrong answer
	    try
	    {
		FileReader file = new FileReader ("Questions.txt");
		BufferedReader input = new BufferedReader (file);

		String qstn[] = new String [1];
		String qstn2[] = new String [1];

		for (int i = 0 ; i < qstn.length ; i++)
		{
		    qstn [i] = input.readLine ();
		    qstn2 [i] = input.readLine ();



		    txtOutput2 = new TextField (qstn2 [i]);
		}
		input.close ();
		txtOutput.setVisible (false);
		frame.add (txtOutput2);
		txtOutput2.setBounds (100, 80, 300, 20);
		repaint ();

		btnSci.setVisible (false);
		repaint ();
		btnMath.setVisible (false);
		repaint ();
		btnM1.setVisible (false);
		btnM2.setVisible (false);
		btnM3.setVisible (false);
		btnM4.setVisible (false);
		btnM5.setVisible (true);
		btnM6.setVisible (true);
		btnM7.setVisible (true);
		btnM8.setVisible (true);









	    }


	    catch (Exception r)
	    {
	    }

	}
	else if (e.getSource () == btnM5)
	{

	    JOptionPane.showMessageDialog (null, "Wrong answer "); //wrong answer
	    try
	    {
		txtOutput2.setVisible (false);
		txtOutput.setVisible (false);
		FileReader file = new FileReader ("Questions.txt");
		BufferedReader input = new BufferedReader (file);

		String qstn[] = new String [1];
		String qstn2[] = new String [1];
		String qstn3[] = new String [1];
		for (int i = 0 ; i < qstn.length ; i++)
		{
		    qstn [i] = input.readLine ();
		    qstn2 [i] = input.readLine ();
		    qstn3 [i] = input.readLine ();


		    txtOutput3 = new TextField (qstn3 [i]);
		}
		input.close ();
		txtOutput2.setVisible (false);
		txtOutput.setVisible (false);
		frame.add (txtOutput3);
		txtOutput3.setBounds (100, 80, 300, 20);
		repaint ();

		btnSci.setVisible (false);
		repaint ();
		btnMath.setVisible (false);
		repaint ();
		btnM1.setVisible (false);
		btnM2.setVisible (false);
		btnM3.setVisible (false);
		btnM4.setVisible (false);
		btnM5.setVisible (false);
		btnM6.setVisible (false);
		btnM7.setVisible (false);
		btnM8.setVisible (false);
		btnM9.setVisible (true);
		btnM10.setVisible (true);
		btnM11.setVisible (true);
		btnM12.setVisible (true);



	    }


	    catch (Exception r)
	    {
	    }


	}


	else if (e.getSource () == btnM6)
	{

	    JOptionPane.showMessageDialog (null, "Wrong answer"); //right answer
	    try
	    {
		txtOutput2.setVisible (false);
		txtOutput.setVisible (false);
		FileReader file = new FileReader ("Questions.txt");
		BufferedReader input = new BufferedReader (file);

		String qstn[] = new String [1];
		String qstn2[] = new String [1];
		String qstn3[] = new String [1];
		for (int i = 0 ; i < qstn.length ; i++)
		{
		    qstn [i] = input.readLine ();
		    qstn2 [i] = input.readLine ();
		    qstn3 [i] = input.readLine ();


		    txtOutput3 = new TextField (qstn3 [i]);
		}
		input.close ();
		txtOutput2.setVisible (false);
		txtOutput.setVisible (false);
		frame.add (txtOutput3);
		txtOutput3.setBounds (100, 80, 300, 20);
		repaint ();

		btnSci.setVisible (false);
		repaint ();
		btnMath.setVisible (false);
		repaint ();
		btnM1.setVisible (false);
		btnM2.setVisible (false);
		btnM3.setVisible (false);
		btnM4.setVisible (false);
		btnM5.setVisible (false);
		btnM6.setVisible (false);
		btnM7.setVisible (false);
		btnM8.setVisible (false);
		btnM9.setVisible (true);
		btnM10.setVisible (true);
		btnM11.setVisible (true);
		btnM12.setVisible (true);



	    }


	    catch (Exception r)
	    {
	    }


	}


	else if (e.getSource () == btnM7)
	{

	    JOptionPane.showMessageDialog (null, "Bang On! "); //wrong answer
	    //cont ();
	    highscore++;
	    try
	    {
		txtOutput2.setVisible (false);
		txtOutput.setVisible (false);
		FileReader file = new FileReader ("Questions.txt");
		BufferedReader input = new BufferedReader (file);

		String qstn[] = new String [1];
		String qstn2[] = new String [1];
		String qstn3[] = new String [1];
		for (int i = 0 ; i < qstn.length ; i++)
		{
		    qstn [i] = input.readLine ();
		    qstn2 [i] = input.readLine ();
		    qstn3 [i] = input.readLine ();


		    txtOutput3 = new TextField (qstn3 [i]);
		}
		input.close ();
		txtOutput2.setVisible (false);
		txtOutput.setVisible (false);
		frame.add (txtOutput3);
		txtOutput3.setBounds (100, 80, 300, 20);
		repaint ();

		btnSci.setVisible (false);
		repaint ();
		btnMath.setVisible (false);
		repaint ();
		btnM1.setVisible (false);
		btnM2.setVisible (false);
		btnM3.setVisible (false);
		btnM4.setVisible (false);
		btnM5.setVisible (false);
		btnM6.setVisible (false);
		btnM7.setVisible (false);
		btnM8.setVisible (false);
		btnM9.setVisible (true);
		btnM10.setVisible (true);
		btnM11.setVisible (true);
		btnM12.setVisible (true);



	    }


	    catch (Exception r)
	    {
	    }


	}


	else if (e.getSource () == btnM8)
	{

	    JOptionPane.showMessageDialog (null, " Wrong answer"); //wrong answer
	    //cont ();
	    try
	    {
		txtOutput2.setVisible (false);
		txtOutput.setVisible (false);
		FileReader file = new FileReader ("Questions.txt");
		BufferedReader input = new BufferedReader (file);

		String qstn[] = new String [1];
		String qstn2[] = new String [1];
		String qstn3[] = new String [1];
		for (int i = 0 ; i < qstn.length ; i++)
		{
		    qstn [i] = input.readLine ();
		    qstn2 [i] = input.readLine ();
		    qstn3 [i] = input.readLine ();


		    txtOutput3 = new TextField (qstn3 [i]);
		}
		input.close ();
		txtOutput2.setVisible (false);
		txtOutput.setVisible (false);
		frame.add (txtOutput3);
		txtOutput3.setBounds (100, 80, 300, 20);
		repaint ();

		btnSci.setVisible (false);
		repaint ();
		btnMath.setVisible (false);
		repaint ();
		btnM1.setVisible (false);
		btnM2.setVisible (false);
		btnM3.setVisible (false);
		btnM4.setVisible (false);
		btnM5.setVisible (false);
		btnM6.setVisible (false);
		btnM7.setVisible (false);
		btnM8.setVisible (false);
		btnM9.setVisible (true);
		btnM10.setVisible (true);
		btnM11.setVisible (true);
		btnM12.setVisible (true);




	    }


	    catch (Exception r)
	    {
	    }



	}
	else if (e.getSource () == btnM9)
	{

	    JOptionPane.showMessageDialog (null, "INCORRECT! "); //wrong answer
	    //cont ();
	    try
	    {
		txtOutput2.setVisible (false);
		txtOutput.setVisible (false);
		FileReader file = new FileReader ("Questions.txt");
		BufferedReader input = new BufferedReader (file);

		String qstn[] = new String [1];
		String qstn2[] = new String [1];
		String qstn3[] = new String [1];
		String qstn4[] = new String [1];

		for (int i = 0 ; i < qstn.length ; i++)
		{
		    qstn [i] = input.readLine ();
		    qstn2 [i] = input.readLine ();
		    qstn3 [i] = input.readLine ();
		    qstn4 [i] = input.readLine ();


		    txtOutput4 = new TextField (qstn4 [i]);
		}
		input.close ();
		txtOutput2.setVisible (false);
		txtOutput.setVisible (false);
		txtOutput3.setVisible (false);
		frame.add (txtOutput4);
		txtOutput4.setBounds (100, 80, 300, 20);
		repaint ();

		btnSci.setVisible (false);
		repaint ();
		btnMath.setVisible (false);
		repaint ();
		btnM1.setVisible (false);
		btnM2.setVisible (false);
		btnM3.setVisible (false);
		btnM4.setVisible (false);
		btnM5.setVisible (false);
		btnM6.setVisible (false);
		btnM7.setVisible (false);
		btnM8.setVisible (false);
		btnM9.setVisible (false);
		btnM10.setVisible (false);
		btnM11.setVisible (false);
		btnM12.setVisible (false);
		btnM13.setVisible (true);
		btnM14.setVisible (true);
		btnM15.setVisible (true);
		btnM16.setVisible (true);



	    }


	    catch (Exception r)
	    {
	    }


	}
	else if (e.getSource () == btnM10)
	{

	    JOptionPane.showMessageDialog (null, "INCORRECT! "); //wrong answer
	    //cont ();
	    try
	    {
		txtOutput2.setVisible (false);
		txtOutput.setVisible (false);
		FileReader file = new FileReader ("Questions.txt");
		BufferedReader input = new BufferedReader (file);

		String qstn[] = new String [1];
		String qstn2[] = new String [1];
		String qstn3[] = new String [1];
		String qstn4[] = new String [1];

		for (int i = 0 ; i < qstn.length ; i++)
		{
		    qstn [i] = input.readLine ();
		    qstn2 [i] = input.readLine ();
		    qstn3 [i] = input.readLine ();
		    qstn4 [i] = input.readLine ();


		    txtOutput4 = new TextField (qstn4 [i]);
		}
		input.close ();
		txtOutput2.setVisible (false);
		txtOutput.setVisible (false);
		txtOutput3.setVisible (false);
		frame.add (txtOutput4);
		txtOutput4.setBounds (100, 80, 300, 20);
		repaint ();

		btnSci.setVisible (false);
		repaint ();
		btnMath.setVisible (false);
		repaint ();
		btnM1.setVisible (false);
		btnM2.setVisible (false);
		btnM3.setVisible (false);
		btnM4.setVisible (false);
		btnM5.setVisible (false);
		btnM6.setVisible (false);
		btnM7.setVisible (false);
		btnM8.setVisible (false);
		btnM9.setVisible (false);
		btnM10.setVisible (false);
		btnM11.setVisible (false);
		btnM12.setVisible (false);
		btnM13.setVisible (true);
		btnM14.setVisible (true);
		btnM15.setVisible (true);
		btnM16.setVisible (true);



	    }


	    catch (Exception r)
	    {
	    }


	}

	else if (e.getSource () == btnM11)
	{

	    JOptionPane.showMessageDialog (null, "INCORRECT! "); //wrong answer
	    //cont ();
	    try
	    {
		txtOutput2.setVisible (false);
		txtOutput.setVisible (false);
		FileReader file = new FileReader ("Questions.txt");
		BufferedReader input = new BufferedReader (file);

		String qstn[] = new String [1];
		String qstn2[] = new String [1];
		String qstn3[] = new String [1];
		String qstn4[] = new String [1];

		for (int i = 0 ; i < qstn.length ; i++)
		{
		    qstn [i] = input.readLine ();
		    qstn2 [i] = input.readLine ();
		    qstn3 [i] = input.readLine ();
		    qstn4 [i] = input.readLine ();


		    txtOutput4 = new TextField (qstn4 [i]);
		}
		input.close ();
		txtOutput2.setVisible (false);
		txtOutput.setVisible (false);
		txtOutput3.setVisible (false);
		frame.add (txtOutput4);
		txtOutput4.setBounds (100, 80, 300, 20);
		repaint ();

		btnSci.setVisible (false);
		repaint ();
		btnMath.setVisible (false);
		repaint ();
		btnM1.setVisible (false);
		btnM2.setVisible (false);
		btnM3.setVisible (false);
		btnM4.setVisible (false);
		btnM5.setVisible (false);
		btnM6.setVisible (false);
		btnM7.setVisible (false);
		btnM8.setVisible (false);
		btnM9.setVisible (false);
		btnM10.setVisible (false);
		btnM11.setVisible (false);
		btnM12.setVisible (false);
		btnM13.setVisible (true);
		btnM14.setVisible (true);
		btnM15.setVisible (true);
		btnM16.setVisible (true);



	    }


	    catch (Exception r)
	    {
	    }


	}

	else if (e.getSource () == btnM12)
	{

	    JOptionPane.showMessageDialog (null, "CORRECT! "); //wrong answer
	    //cont ();
	    highscore++;
	    try
	    {

		txtOutput2.setVisible (false);
		txtOutput.setVisible (false);
		FileReader file = new FileReader ("Questions.txt");
		BufferedReader input = new BufferedReader (file);

		String qstn[] = new String [1];
		String qstn2[] = new String [1];
		String qstn3[] = new String [1];
		String qstn4[] = new String [1];

		for (int i = 0 ; i < qstn.length ; i++)
		{
		    qstn [i] = input.readLine ();
		    qstn2 [i] = input.readLine ();
		    qstn3 [i] = input.readLine ();
		    qstn4 [i] = input.readLine ();


		    txtOutput4 = new TextField (qstn4 [i]);
		}
		input.close ();
		txtOutput2.setVisible (false);
		txtOutput.setVisible (false);
		txtOutput3.setVisible (false);
		frame.add (txtOutput4);
		txtOutput4.setBounds (100, 80, 300, 20);
		repaint ();

		btnSci.setVisible (false);
		repaint ();
		btnMath.setVisible (false);
		repaint ();
		btnM1.setVisible (false);
		btnM2.setVisible (false);
		btnM3.setVisible (false);
		btnM4.setVisible (false);
		btnM5.setVisible (false);
		btnM6.setVisible (false);
		btnM7.setVisible (false);
		btnM8.setVisible (false);
		btnM9.setVisible (false);
		btnM10.setVisible (false);
		btnM11.setVisible (false);
		btnM12.setVisible (false);
		btnM13.setVisible (true);
		btnM14.setVisible (true);
		btnM15.setVisible (true);
		btnM16.setVisible (true);




	    }


	    catch (Exception r)
	    {
	    }


	}

	else if (e.getSource () == btnM13)
	{

	    JOptionPane.showMessageDialog (null, "SO CLOSE! "); //wrong answer
	    //cont ();
	    try
	    {
		txtOutput2.setVisible (false);
		txtOutput.setVisible (false);
		FileReader file = new FileReader ("Questions.txt");
		BufferedReader input = new BufferedReader (file);

		String qstn[] = new String [1];
		String qstn2[] = new String [1];
		String qstn3[] = new String [1];
		String qstn4[] = new String [1];
		String qstn5[] = new String [1];

		for (int i = 0 ; i < qstn.length ; i++)
		{
		    qstn [i] = input.readLine ();
		    qstn2 [i] = input.readLine ();
		    qstn3 [i] = input.readLine ();
		    qstn4 [i] = input.readLine ();
		    qstn5 [i] = input.readLine ();


		    txtOutput5 = new TextField (qstn5 [i]);
		}
		input.close ();
		txtOutput2.setVisible (false);
		txtOutput.setVisible (false);
		txtOutput3.setVisible (false);
		txtOutput4.setVisible (false);

		frame.add (txtOutput5);
		txtOutput5.setBounds (100, 80, 300, 20);
		repaint ();

		btnSci.setVisible (false);
		repaint ();
		btnMath.setVisible (false);
		repaint ();
		btnM1.setVisible (false);
		btnM2.setVisible (false);
		btnM3.setVisible (false);
		btnM4.setVisible (false);
		btnM5.setVisible (false);
		btnM6.setVisible (false);
		btnM7.setVisible (false);
		btnM8.setVisible (false);
		btnM9.setVisible (false);
		btnM10.setVisible (false);
		btnM11.setVisible (false);
		btnM12.setVisible (false);
		btnM13.setVisible (false);
		btnM14.setVisible (false);
		btnM15.setVisible (false);
		btnM16.setVisible (false);
		btnM17.setVisible (true);
		btnM18.setVisible (true);
		btnM19.setVisible (true);
		btnM20.setVisible (true);



	    }


	    catch (Exception r)
	    {
	    }


	}



	else if (e.getSource () == btnM14)
	{

	    JOptionPane.showMessageDialog (null, "SO CLOSE! "); //wrong answer
	    //cont ();
	    try
	    {
		txtOutput2.setVisible (false);
		txtOutput.setVisible (false);
		FileReader file = new FileReader ("Questions.txt");
		BufferedReader input = new BufferedReader (file);

		String qstn[] = new String [1];
		String qstn2[] = new String [1];
		String qstn3[] = new String [1];
		String qstn4[] = new String [1];
		String qstn5[] = new String [1];

		for (int i = 0 ; i < qstn.length ; i++)
		{
		    qstn [i] = input.readLine ();
		    qstn2 [i] = input.readLine ();
		    qstn3 [i] = input.readLine ();
		    qstn4 [i] = input.readLine ();
		    qstn5 [i] = input.readLine ();


		    txtOutput5 = new TextField (qstn5 [i]);
		}
		input.close ();
		txtOutput2.setVisible (false);
		txtOutput.setVisible (false);
		txtOutput3.setVisible (false);
		txtOutput4.setVisible (false);

		frame.add (txtOutput5);
		txtOutput5.setBounds (100, 80, 300, 20);
		repaint ();

		btnSci.setVisible (false);
		repaint ();
		btnMath.setVisible (false);
		repaint ();
		btnM1.setVisible (false);
		btnM2.setVisible (false);
		btnM3.setVisible (false);
		btnM4.setVisible (false);
		btnM5.setVisible (false);
		btnM6.setVisible (false);
		btnM7.setVisible (false);
		btnM8.setVisible (false);
		btnM9.setVisible (false);
		btnM10.setVisible (false);
		btnM11.setVisible (false);
		btnM12.setVisible (false);
		btnM13.setVisible (false);
		btnM14.setVisible (false);
		btnM15.setVisible (false);
		btnM16.setVisible (false);
		btnM17.setVisible (true);
		btnM18.setVisible (true);
		btnM19.setVisible (true);
		btnM20.setVisible (true);

		FileWriter outFile = new FileWriter ("MATHQ.txt");
		PrintWriter output = new PrintWriter (outFile);




		// loop to store Questions into the new file.
		for (int k = 0 ; k < qstn.length ; k++)
		{
		    // write to the file
		    //output.println (qstn [k]);
		    output.println (qstn [k]);
		    output.println (qstn2 [k]);
		    output.println (qstn3 [k]);
		    output.println (qstn4 [k]);
		    output.println (qstn5 [k]);
		    // display array information on the screen


		}
		output.close ();



	    }


	    catch (Exception r)
	    {
	    }


	}


	else if (e.getSource () == btnM15)
	{

	    JOptionPane.showMessageDialog (null, "YOU GOT IT! "); //wrong answer
	    //cont ();
	    highscore++;
	    try
	    {

		txtOutput2.setVisible (false);
		txtOutput.setVisible (false);
		FileReader file = new FileReader ("Questions.txt");
		BufferedReader input = new BufferedReader (file);

		String qstn[] = new String [1];
		String qstn2[] = new String [1];
		String qstn3[] = new String [1];
		String qstn4[] = new String [1];
		String qstn5[] = new String [1];

		for (int i = 0 ; i < qstn.length ; i++)
		{
		    qstn [i] = input.readLine ();
		    qstn2 [i] = input.readLine ();
		    qstn3 [i] = input.readLine ();
		    qstn4 [i] = input.readLine ();
		    qstn5 [i] = input.readLine ();


		    txtOutput5 = new TextField (qstn5 [i]);
		}
		input.close ();
		txtOutput2.setVisible (false);
		txtOutput.setVisible (false);
		txtOutput3.setVisible (false);
		txtOutput4.setVisible (false);

		frame.add (txtOutput5);
		txtOutput5.setBounds (100, 80, 300, 20);
		repaint ();

		btnSci.setVisible (false);
		repaint ();
		btnMath.setVisible (false);
		repaint ();
		btnM1.setVisible (false);
		btnM2.setVisible (false);
		btnM3.setVisible (false);
		btnM4.setVisible (false);
		btnM5.setVisible (false);
		btnM6.setVisible (false);
		btnM7.setVisible (false);
		btnM8.setVisible (false);
		btnM9.setVisible (false);
		btnM10.setVisible (false);
		btnM11.setVisible (false);
		btnM12.setVisible (false);
		btnM13.setVisible (false);
		btnM14.setVisible (false);
		btnM15.setVisible (false);
		btnM16.setVisible (false);
		btnM17.setVisible (true);
		btnM18.setVisible (true);
		btnM19.setVisible (true);
		btnM20.setVisible (true);
		FileWriter outFile = new FileWriter ("MATHQ.txt");
		PrintWriter output = new PrintWriter (outFile);




		// loop to store Questions into the new file.
		for (int k = 0 ; k < qstn.length ; k++)
		{
		    // write to the file
		    //output.println (qstn [k]);
		    output.println (qstn [k]);
		    output.println (qstn2 [k]);
		    output.println (qstn3 [k]);
		    output.println (qstn4 [k]);
		    output.println (qstn5 [k]);
		    // display array information on the screen


		}
		output.close ();



	    }


	    catch (Exception r)
	    {
	    }


	}


	else if (e.getSource () == btnM16)
	{

	    JOptionPane.showMessageDialog (null, "SO CLOSE! "); //wrong answer
	    //cont ();
	    try
	    {
		txtOutput2.setVisible (false);
		txtOutput.setVisible (false);
		FileReader file = new FileReader ("Questions.txt");
		BufferedReader input = new BufferedReader (file);

		String qstn[] = new String [1];
		String qstn2[] = new String [1];
		String qstn3[] = new String [1];
		String qstn4[] = new String [1];
		String qstn5[] = new String [1];

		for (int i = 0 ; i < qstn.length ; i++)
		{
		    qstn [i] = input.readLine ();
		    qstn2 [i] = input.readLine ();
		    qstn3 [i] = input.readLine ();
		    qstn4 [i] = input.readLine ();
		    qstn5 [i] = input.readLine ();


		    txtOutput5 = new TextField (qstn5 [i]);
		}
		input.close ();
		txtOutput2.setVisible (false);
		txtOutput.setVisible (false);
		txtOutput3.setVisible (false);
		txtOutput4.setVisible (false);

		frame.add (txtOutput5);
		txtOutput5.setBounds (100, 80, 300, 20);
		repaint ();

		btnSci.setVisible (false);
		repaint ();
		btnMath.setVisible (false);
		repaint ();
		btnM1.setVisible (false);
		btnM2.setVisible (false);
		btnM3.setVisible (false);
		btnM4.setVisible (false);
		btnM5.setVisible (false);
		btnM6.setVisible (false);
		btnM7.setVisible (false);
		btnM8.setVisible (false);
		btnM9.setVisible (false);
		btnM10.setVisible (false);
		btnM11.setVisible (false);
		btnM12.setVisible (false);
		btnM13.setVisible (false);
		btnM14.setVisible (false);
		btnM15.setVisible (false);
		btnM16.setVisible (false);
		btnM17.setVisible (true);
		btnM18.setVisible (true);
		btnM19.setVisible (true);
		btnM20.setVisible (true);


		FileWriter outFile = new FileWriter ("MATHQ.txt");
		PrintWriter output = new PrintWriter (outFile);




		// loop to store Questions into the new file.
		for (int k = 0 ; k < qstn.length ; k++)
		{
		    // write to the file
		    //output.println (qstn [k]);
		    output.println (qstn [k]);
		    output.println (qstn2 [k]);
		    output.println (qstn3 [k]);
		    output.println (qstn4 [k]);
		    output.println (qstn5 [k]);
		    // display array information on the screen


		}
		output.close ();


	    }


	    catch (Exception r)
	    {
	    }


	}
	else if (e.getSource () == btnM17)
	{

	    JOptionPane.showMessageDialog (null, "IT'S A SHAME TO GET THE LAST QUESTION WRONG! "); //wrong answer
	    JOptionPane.showMessageDialog (null, "YOU FINISHED THE QUIZ! \nYou can check the Questions written In the MATHQ.txt file \nTo view Highscore Finish both of the Quizes  "); //end

	    txtOutput2.setVisible (false);
	    txtOutput.setVisible (false);
	    txtOutput3.setVisible (false);
	    txtOutput4.setVisible (false);
	    txtOutput5.setVisible (false);

	    btnSci.setVisible (true);
	    repaint ();
	    btnMath.setVisible (true);
	    repaint ();
	    btnM1.setVisible (false);
	    btnM2.setVisible (false);
	    btnM3.setVisible (false);
	    btnM4.setVisible (false);
	    btnM5.setVisible (false);
	    btnM6.setVisible (false);
	    btnM7.setVisible (false);
	    btnM8.setVisible (false);
	    btnM9.setVisible (false);
	    btnM10.setVisible (false);
	    btnM11.setVisible (false);
	    btnM12.setVisible (false);
	    btnM13.setVisible (false);
	    btnM14.setVisible (false);
	    btnM15.setVisible (false);
	    btnM16.setVisible (false);
	    btnM17.setVisible (false);
	    btnM18.setVisible (false);
	    btnM19.setVisible (false);
	    btnM20.setVisible (false);


	}
	else if (e.getSource () == btnM18)
	{

	    JOptionPane.showMessageDialog (null, "IT'S A SHAME TO GET THE LAST QUESTION WRONG! "); //wrong answer
	    JOptionPane.showMessageDialog (null, "YOU FINISHED THE QUIZ! \nYou can check the Questions written In the MATHQ.txt file \nTo view Highscore Finish both of the Quizes  "); //end

	    txtOutput2.setVisible (false);
	    txtOutput.setVisible (false);
	    txtOutput3.setVisible (false);
	    txtOutput4.setVisible (false);
	    txtOutput5.setVisible (false);

	    btnSci.setVisible (true);
	    repaint ();
	    btnMath.setVisible (true);
	    repaint ();
	    btnM1.setVisible (false);
	    btnM2.setVisible (false);
	    btnM3.setVisible (false);
	    btnM4.setVisible (false);
	    btnM5.setVisible (false);
	    btnM6.setVisible (false);
	    btnM7.setVisible (false);
	    btnM8.setVisible (false);
	    btnM9.setVisible (false);
	    btnM10.setVisible (false);
	    btnM11.setVisible (false);
	    btnM12.setVisible (false);
	    btnM13.setVisible (false);
	    btnM14.setVisible (false);
	    btnM15.setVisible (false);
	    btnM16.setVisible (false);
	    btnM17.setVisible (false);
	    btnM18.setVisible (false);
	    btnM19.setVisible (false);
	    btnM20.setVisible (false);






	}

	else if (e.getSource () == btnM19)
	{
	    highscore++;
	    JOptionPane.showMessageDialog (null, "VERY WELL DONE!  "); //right answer
	    JOptionPane.showMessageDialog (null, "YOU FINISHED THE QUIZ! \nYou can check the Questions written In the MATHQ.txt file \nTo view Highscore Finish both of the Quizes  "); //end
	    //cont ();

	    txtOutput2.setVisible (false);
	    txtOutput.setVisible (false);
	    txtOutput3.setVisible (false);
	    txtOutput4.setVisible (false);
	    txtOutput5.setVisible (false);

	    btnSci.setVisible (true);
	    repaint ();
	    btnMath.setVisible (true);
	    repaint ();
	    btnM1.setVisible (false);
	    btnM2.setVisible (false);
	    btnM3.setVisible (false);
	    btnM4.setVisible (false);
	    btnM5.setVisible (false);
	    btnM6.setVisible (false);
	    btnM7.setVisible (false);
	    btnM8.setVisible (false);
	    btnM9.setVisible (false);
	    btnM10.setVisible (false);
	    btnM11.setVisible (false);
	    btnM12.setVisible (false);
	    btnM13.setVisible (false);
	    btnM14.setVisible (false);
	    btnM15.setVisible (false);
	    btnM16.setVisible (false);
	    btnM17.setVisible (false);
	    btnM18.setVisible (false);
	    btnM19.setVisible (false);
	    btnM20.setVisible (false);






	}

	else if (e.getSource () == btnM20)
	{

	    JOptionPane.showMessageDialog (null, "IT'S A SHAME TO GET THE LAST QUESTION WRONG! "); //wrong answer
	    JOptionPane.showMessageDialog (null, "YOU FINISHED THE QUIZ! \nYou can check the Questions written In the MATHQ.txt file \nTo view Highscore Finish both of the Quizes  "); //end

	    txtOutput2.setVisible (false);
	    txtOutput.setVisible (false);
	    txtOutput3.setVisible (false);
	    txtOutput4.setVisible (false);
	    txtOutput5.setVisible (false);

	    btnSci.setVisible (true);
	    repaint ();
	    btnMath.setVisible (true);
	    repaint ();
	    btnM1.setVisible (false);
	    btnM2.setVisible (false);
	    btnM3.setVisible (false);
	    btnM4.setVisible (false);
	    btnM5.setVisible (false);
	    btnM6.setVisible (false);
	    btnM7.setVisible (false);
	    btnM8.setVisible (false);
	    btnM9.setVisible (false);
	    btnM10.setVisible (false);
	    btnM11.setVisible (false);
	    btnM12.setVisible (false);
	    btnM13.setVisible (false);
	    btnM14.setVisible (false);
	    btnM15.setVisible (false);
	    btnM16.setVisible (false);
	    btnM17.setVisible (false);
	    btnM18.setVisible (false);
	    btnM19.setVisible (false);
	    btnM20.setVisible (false);


	}




	else if (e.getSource () == btnSci)
	{


	    try
	    {
		FileReader file = new FileReader ("ScienceQuestions.txt");
		BufferedReader input = new BufferedReader (file);
		String qstn[] = new String [1];

		for (int i = 0 ; i < qstn.length ; i++)
		{
		    qstn [i] = input.readLine ();


		    txtOutput = new TextField (qstn [i]);
		}
		input.close ();
		btnSci.setVisible (false);
		repaint ();
		btnMath.setVisible (false);
		repaint ();

		frame.add (txtOutput);
		txtOutput.setBounds (100, 80, 300, 20);
		repaint ();
		btnS1.setVisible (true);
		btnS2.setVisible (true);
		btnS3.setVisible (true);
		btnS4.setVisible (true);
	    }
	    catch (Exception r)
	    {
	    }
	}


	else if (e.getSource () == btnS1)
	{

	    JOptionPane.showMessageDialog (null, "Wrong answer "); //wrong answer
	    try
	    {
		FileReader file = new FileReader ("ScienceQuestions.txt");
		BufferedReader input = new BufferedReader (file);
		String Sqstn[] = new String [1];
		String Sqstn2[] = new String [1];

		for (int i = 0 ; i < Sqstn.length ; i++)
		{
		    Sqstn [i] = input.readLine ();
		    Sqstn2 [i] = input.readLine ();


		    txtOutput2 = new TextField (Sqstn2 [i]);
		}
		input.close ();
		btnSci.setVisible (false);
		txtOutput.setVisible (false);

		repaint ();
		btnMath.setVisible (false);
		repaint ();

		frame.add (txtOutput2);
		txtOutput2.setBounds (100, 80, 300, 20);
		repaint ();
		btnS1.setVisible (false);
		btnS2.setVisible (false);
		btnS3.setVisible (false);
		btnS4.setVisible (false);
		btnS5.setVisible (true);
		btnS6.setVisible (true);
		btnS7.setVisible (true);
		btnS8.setVisible (true);
	    }
	    catch (Exception r)
	    {
	    }
	}






	else if (e.getSource () == btnS2)
	{

	    JOptionPane.showMessageDialog (null, "That's correct"); //right answer

	    try
	    {
		highscore++;
		FileReader file = new FileReader ("ScienceQuestions.txt");
		BufferedReader input = new BufferedReader (file);
		String Sqstn[] = new String [1];
		String Sqstn2[] = new String [1];

		for (int i = 0 ; i < Sqstn.length ; i++)
		{
		    Sqstn [i] = input.readLine ();
		    Sqstn2 [i] = input.readLine ();


		    txtOutput2 = new TextField (Sqstn2 [i]);
		}
		input.close ();
		btnSci.setVisible (false);
		txtOutput.setVisible (false);

		repaint ();
		btnMath.setVisible (false);
		repaint ();

		frame.add (txtOutput2);
		txtOutput2.setBounds (100, 80, 300, 20);
		repaint ();
		btnS1.setVisible (false);
		btnS2.setVisible (false);
		btnS3.setVisible (false);
		btnS4.setVisible (false);
		btnS5.setVisible (true);
		btnS6.setVisible (true);
		btnS7.setVisible (true);
		btnS8.setVisible (true);
	    }
	    catch (Exception r)
	    {
	    }
	}





	else if (e.getSource () == btnS3)
	{

	    JOptionPane.showMessageDialog (null, "Wrong answer "); //wrong answer

	    try
	    {
		FileReader file = new FileReader ("ScienceQuestions.txt");
		BufferedReader input = new BufferedReader (file);
		String Sqstn[] = new String [1];
		String Sqstn2[] = new String [1];

		for (int i = 0 ; i < Sqstn.length ; i++)
		{
		    Sqstn [i] = input.readLine ();
		    Sqstn2 [i] = input.readLine ();


		    txtOutput2 = new TextField (Sqstn2 [i]);
		}
		input.close ();
		btnSci.setVisible (false);
		txtOutput.setVisible (false);

		repaint ();
		btnMath.setVisible (false);
		repaint ();

		frame.add (txtOutput2);
		txtOutput2.setBounds (100, 80, 300, 20);
		repaint ();
		btnS1.setVisible (false);
		btnS2.setVisible (false);
		btnS3.setVisible (false);
		btnS4.setVisible (false);
		btnS5.setVisible (true);
		btnS6.setVisible (true);
		btnS7.setVisible (true);
		btnS8.setVisible (true);
	    }
	    catch (Exception r)
	    {
	    }
	}






	else if (e.getSource () == btnS4)
	{

	    JOptionPane.showMessageDialog (null, "Wrong answer "); //wrong answer

	    try
	    {
		FileReader file = new FileReader ("ScienceQuestions.txt");
		BufferedReader input = new BufferedReader (file);
		String Sqstn[] = new String [1];
		String Sqstn2[] = new String [1];

		for (int i = 0 ; i < Sqstn.length ; i++)
		{
		    Sqstn [i] = input.readLine ();
		    Sqstn2 [i] = input.readLine ();


		    txtOutput2 = new TextField (Sqstn2 [i]);
		}
		input.close ();
		btnSci.setVisible (false);
		txtOutput.setVisible (false);

		repaint ();
		btnMath.setVisible (false);
		repaint ();

		frame.add (txtOutput2);
		txtOutput2.setBounds (100, 80, 300, 20);
		repaint ();
		btnS1.setVisible (false);
		btnS2.setVisible (false);
		btnS3.setVisible (false);
		btnS4.setVisible (false);
		btnS5.setVisible (true);
		btnS6.setVisible (true);
		btnS7.setVisible (true);
		btnS8.setVisible (true);
	    }


	    catch (Exception r)
	    {
	    }
	}

	else if (e.getSource () == btnS5)
	{

	    JOptionPane.showMessageDialog (null, "Wrong answer "); //wrong answer

	    try
	    {
		FileReader file = new FileReader ("ScienceQuestions.txt");
		BufferedReader input = new BufferedReader (file);
		String Sqstn[] = new String [1];
		String Sqstn2[] = new String [1];
		String Sqstn3[] = new String [1];

		for (int i = 0 ; i < Sqstn.length ; i++)
		{
		    Sqstn [i] = input.readLine ();
		    Sqstn2 [i] = input.readLine ();
		    Sqstn3 [i] = input.readLine ();



		    txtOutput3 = new TextField (Sqstn3 [i]);
		}
		input.close ();
		btnSci.setVisible (false);
		txtOutput.setVisible (false);
		txtOutput2.setVisible (false);


		repaint ();
		btnMath.setVisible (false);
		repaint ();
		frame.add (txtOutput3);
		txtOutput3.setBounds (100, 80, 300, 20);
		repaint ();
		btnS1.setVisible (false);
		btnS2.setVisible (false);
		btnS3.setVisible (false);
		btnS4.setVisible (false);
		btnS5.setVisible (false);
		btnS6.setVisible (false);
		btnS7.setVisible (false);
		btnS8.setVisible (false);
		btnS9.setVisible (true);
		btnS10.setVisible (true);
		btnS11.setVisible (true);
		btnS12.setVisible (true);

	    }


	    catch (Exception r)
	    {
	    }
	}
	else if (e.getSource () == btnS6)
	{

	    JOptionPane.showMessageDialog (null, "Wrong answer "); //wrong answer

	    try
	    {
		FileReader file = new FileReader ("ScienceQuestions.txt");
		BufferedReader input = new BufferedReader (file);
		String Sqstn[] = new String [1];
		String Sqstn2[] = new String [1];
		String Sqstn3[] = new String [1];

		for (int i = 0 ; i < Sqstn.length ; i++)
		{
		    Sqstn [i] = input.readLine ();
		    Sqstn2 [i] = input.readLine ();
		    Sqstn3 [i] = input.readLine ();



		    txtOutput3 = new TextField (Sqstn3 [i]);
		}
		input.close ();
		btnSci.setVisible (false);
		txtOutput.setVisible (false);
		txtOutput2.setVisible (false);


		repaint ();
		btnMath.setVisible (false);
		repaint ();
		frame.add (txtOutput3);
		txtOutput3.setBounds (100, 80, 300, 20);
		repaint ();
		btnS1.setVisible (false);
		btnS2.setVisible (false);
		btnS3.setVisible (false);
		btnS4.setVisible (false);
		btnS5.setVisible (false);
		btnS6.setVisible (false);
		btnS7.setVisible (false);
		btnS8.setVisible (false);
		btnS9.setVisible (true);
		btnS10.setVisible (true);
		btnS11.setVisible (true);
		btnS12.setVisible (true);

	    }


	    catch (Exception r)
	    {
	    }
	}
	else if (e.getSource () == btnS7)
	{

	    JOptionPane.showMessageDialog (null, "Wrong answer "); //wrong answer

	    try
	    {
		FileReader file = new FileReader ("ScienceQuestions.txt");
		BufferedReader input = new BufferedReader (file);
		String Sqstn[] = new String [1];
		String Sqstn2[] = new String [1];
		String Sqstn3[] = new String [1];

		for (int i = 0 ; i < Sqstn.length ; i++)
		{
		    Sqstn [i] = input.readLine ();
		    Sqstn2 [i] = input.readLine ();
		    Sqstn3 [i] = input.readLine ();



		    txtOutput3 = new TextField (Sqstn3 [i]);
		}
		input.close ();
		btnSci.setVisible (false);
		txtOutput.setVisible (false);
		txtOutput2.setVisible (false);


		repaint ();
		btnMath.setVisible (false);
		repaint ();
		frame.add (txtOutput3);
		txtOutput3.setBounds (100, 80, 300, 20);
		repaint ();
		btnS1.setVisible (false);
		btnS2.setVisible (false);
		btnS3.setVisible (false);
		btnS4.setVisible (false);
		btnS5.setVisible (false);
		btnS6.setVisible (false);
		btnS7.setVisible (false);
		btnS8.setVisible (false);
		btnS9.setVisible (true);
		btnS10.setVisible (true);
		btnS11.setVisible (true);
		btnS12.setVisible (true);

	    }


	    catch (Exception r)
	    {
	    }
	}
	else if (e.getSource () == btnS8)
	{

	    JOptionPane.showMessageDialog (null, "CORRECT! "); //wrong answer
	    highscore++;
	    try
	    {
		FileReader file = new FileReader ("ScienceQuestions.txt");
		BufferedReader input = new BufferedReader (file);
		String Sqstn[] = new String [1];
		String Sqstn2[] = new String [1];
		String Sqstn3[] = new String [1];

		for (int i = 0 ; i < Sqstn.length ; i++)
		{
		    Sqstn [i] = input.readLine ();
		    Sqstn2 [i] = input.readLine ();
		    Sqstn3 [i] = input.readLine ();



		    txtOutput3 = new TextField (Sqstn3 [i]);
		}
		input.close ();
		btnSci.setVisible (false);
		txtOutput.setVisible (false);
		txtOutput2.setVisible (false);


		repaint ();
		btnMath.setVisible (false);
		repaint ();
		frame.add (txtOutput3);
		txtOutput3.setBounds (100, 80, 300, 20);
		repaint ();
		btnS1.setVisible (false);
		btnS2.setVisible (false);
		btnS3.setVisible (false);
		btnS4.setVisible (false);
		btnS5.setVisible (false);
		btnS6.setVisible (false);
		btnS7.setVisible (false);
		btnS8.setVisible (false);
		btnS9.setVisible (true);
		btnS10.setVisible (true);
		btnS11.setVisible (true);
		btnS12.setVisible (true);

	    }


	    catch (Exception r)
	    {
	    }
	}


	else if (e.getSource () == btnS9)
	{

	    JOptionPane.showMessageDialog (null, "NOPE, Thats wrong! "); //wrong answer

	    try
	    {
		FileReader file = new FileReader ("ScienceQuestions.txt");
		BufferedReader input = new BufferedReader (file);
		String Sqstn[] = new String [1];
		String Sqstn2[] = new String [1];
		String Sqstn3[] = new String [1];
		String Sqstn4[] = new String [1];

		for (int i = 0 ; i < Sqstn.length ; i++)
		{
		    Sqstn [i] = input.readLine ();
		    Sqstn2 [i] = input.readLine ();
		    Sqstn3 [i] = input.readLine ();
		    Sqstn4 [i] = input.readLine ();



		    txtOutput4 = new TextField (Sqstn4 [i]);
		}
		input.close ();
		btnSci.setVisible (false);
		txtOutput.setVisible (false);
		txtOutput2.setVisible (false);
		txtOutput3.setVisible (false);


		repaint ();
		btnMath.setVisible (false);
		repaint ();
		frame.add (txtOutput4);
		txtOutput4.setBounds (100, 80, 300, 20);
		repaint ();
		btnS1.setVisible (false);
		btnS2.setVisible (false);
		btnS3.setVisible (false);
		btnS4.setVisible (false);
		btnS5.setVisible (false);
		btnS6.setVisible (false);
		btnS7.setVisible (false);
		btnS8.setVisible (false);
		btnS9.setVisible (false);
		btnS10.setVisible (false);
		btnS11.setVisible (false);
		btnS12.setVisible (false);
		btnS13.setVisible (true);
		btnS14.setVisible (true);
		btnS15.setVisible (true);
		btnS16.setVisible (true);

	    }


	    catch (Exception r)
	    {
	    }
	}



	else if (e.getSource () == btnS10)
	{

	    JOptionPane.showMessageDialog (null, "NOPE, Thats wrong! "); //wrong answer

	    try
	    {
		FileReader file = new FileReader ("ScienceQuestions.txt");
		BufferedReader input = new BufferedReader (file);
		String Sqstn[] = new String [1];
		String Sqstn2[] = new String [1];
		String Sqstn3[] = new String [1];
		String Sqstn4[] = new String [1];

		for (int i = 0 ; i < Sqstn.length ; i++)
		{
		    Sqstn [i] = input.readLine ();
		    Sqstn2 [i] = input.readLine ();
		    Sqstn3 [i] = input.readLine ();
		    Sqstn4 [i] = input.readLine ();



		    txtOutput4 = new TextField (Sqstn4 [i]);
		}
		input.close ();
		btnSci.setVisible (false);
		txtOutput.setVisible (false);
		txtOutput2.setVisible (false);
		txtOutput3.setVisible (false);


		repaint ();
		btnMath.setVisible (false);
		repaint ();
		frame.add (txtOutput4);
		txtOutput4.setBounds (100, 80, 300, 20);
		repaint ();
		btnS1.setVisible (false);
		btnS2.setVisible (false);
		btnS3.setVisible (false);
		btnS4.setVisible (false);
		btnS5.setVisible (false);
		btnS6.setVisible (false);
		btnS7.setVisible (false);
		btnS8.setVisible (false);
		btnS9.setVisible (false);
		btnS10.setVisible (false);
		btnS11.setVisible (false);
		btnS12.setVisible (false);
		btnS13.setVisible (true);
		btnS14.setVisible (true);
		btnS15.setVisible (true);
		btnS16.setVisible (true);

	    }


	    catch (Exception r)
	    {
	    }
	}




	else if (e.getSource () == btnS11)
	{

	    JOptionPane.showMessageDialog (null, "THAT'S RIGHT PAL! "); //wrong answer
	    highscore++;
	    try
	    {
		FileReader file = new FileReader ("ScienceQuestions.txt");
		BufferedReader input = new BufferedReader (file);
		String Sqstn[] = new String [1];
		String Sqstn2[] = new String [1];
		String Sqstn3[] = new String [1];
		String Sqstn4[] = new String [1];

		for (int i = 0 ; i < Sqstn.length ; i++)
		{
		    Sqstn [i] = input.readLine ();
		    Sqstn2 [i] = input.readLine ();
		    Sqstn3 [i] = input.readLine ();
		    Sqstn4 [i] = input.readLine ();



		    txtOutput4 = new TextField (Sqstn4 [i]);
		}
		input.close ();
		btnSci.setVisible (false);
		txtOutput.setVisible (false);
		txtOutput2.setVisible (false);
		txtOutput3.setVisible (false);


		repaint ();
		btnMath.setVisible (false);
		repaint ();
		frame.add (txtOutput4);
		txtOutput4.setBounds (100, 80, 300, 20);
		repaint ();
		btnS1.setVisible (false);
		btnS2.setVisible (false);
		btnS3.setVisible (false);
		btnS4.setVisible (false);
		btnS5.setVisible (false);
		btnS6.setVisible (false);
		btnS7.setVisible (false);
		btnS8.setVisible (false);
		btnS9.setVisible (false);
		btnS10.setVisible (false);
		btnS11.setVisible (false);
		btnS12.setVisible (false);
		btnS13.setVisible (true);
		btnS14.setVisible (true);
		btnS15.setVisible (true);
		btnS16.setVisible (true);

	    }


	    catch (Exception r)
	    {
	    }
	}




	else if (e.getSource () == btnS12)
	{

	    JOptionPane.showMessageDialog (null, "NOPE, Thats wrong! "); //wrong answer

	    try
	    {
		FileReader file = new FileReader ("ScienceQuestions.txt");
		BufferedReader input = new BufferedReader (file);
		String Sqstn[] = new String [1];
		String Sqstn2[] = new String [1];
		String Sqstn3[] = new String [1];
		String Sqstn4[] = new String [1];

		for (int i = 0 ; i < Sqstn.length ; i++)
		{
		    Sqstn [i] = input.readLine ();
		    Sqstn2 [i] = input.readLine ();
		    Sqstn3 [i] = input.readLine ();
		    Sqstn4 [i] = input.readLine ();



		    txtOutput4 = new TextField (Sqstn4 [i]);
		}
		input.close ();
		btnSci.setVisible (false);
		txtOutput.setVisible (false);
		txtOutput2.setVisible (false);
		txtOutput3.setVisible (false);


		repaint ();
		btnMath.setVisible (false);
		repaint ();
		frame.add (txtOutput4);
		txtOutput4.setBounds (100, 80, 300, 20);
		repaint ();
		btnS1.setVisible (false);
		btnS2.setVisible (false);
		btnS3.setVisible (false);
		btnS4.setVisible (false);
		btnS5.setVisible (false);
		btnS6.setVisible (false);
		btnS7.setVisible (false);
		btnS8.setVisible (false);
		btnS9.setVisible (false);
		btnS10.setVisible (false);
		btnS11.setVisible (false);
		btnS12.setVisible (false);
		btnS13.setVisible (true);
		btnS14.setVisible (true);
		btnS15.setVisible (true);
		btnS16.setVisible (true);

	    }


	    catch (Exception r)
	    {
	    }
	}


	else if (e.getSource () == btnS13)
	{

	    JOptionPane.showMessageDialog (null, "TSK TSK! I THOUGHT YOU KNEW THIS! "); //wrong answer

	    try
	    {
		FileReader file = new FileReader ("ScienceQuestions.txt");
		BufferedReader input = new BufferedReader (file);
		String Sqstn[] = new String [1];
		String Sqstn2[] = new String [1];
		String Sqstn3[] = new String [1];
		String Sqstn4[] = new String [1];
		String Sqstn5[] = new String [1];

		for (int i = 0 ; i < Sqstn.length ; i++)
		{
		    Sqstn [i] = input.readLine ();
		    Sqstn2 [i] = input.readLine ();
		    Sqstn3 [i] = input.readLine ();
		    Sqstn4 [i] = input.readLine ();
		    Sqstn5 [i] = input.readLine ();




		    txtOutput5 = new TextField (Sqstn5 [i]);
		}
		input.close ();
		btnSci.setVisible (false);
		txtOutput.setVisible (false);
		txtOutput2.setVisible (false);
		txtOutput3.setVisible (false);
		txtOutput4.setVisible (false);


		repaint ();
		btnMath.setVisible (false);
		repaint ();
		frame.add (txtOutput5);
		txtOutput5.setBounds (100, 80, 300, 20);
		repaint ();
		btnS1.setVisible (false);
		btnS2.setVisible (false);
		btnS3.setVisible (false);
		btnS4.setVisible (false);
		btnS5.setVisible (false);
		btnS6.setVisible (false);
		btnS7.setVisible (false);
		btnS8.setVisible (false);
		btnS9.setVisible (false);
		btnS10.setVisible (false);
		btnS11.setVisible (false);
		btnS12.setVisible (false);
		btnS13.setVisible (false);
		btnS14.setVisible (false);
		btnS15.setVisible (false);
		btnS16.setVisible (false);
		btnS17.setVisible (true);
		btnS18.setVisible (true);
		btnS19.setVisible (true);
		btnS20.setVisible (true);

		FileWriter outFile = new FileWriter ("SCIQ.txt");
		PrintWriter output = new PrintWriter (outFile);




		// loop to store Questions into the new file.
		for (int k = 0 ; k < Sqstn.length ; k++)
		{
		    // write to the file
		    //output.println (qstn [k]);
		    output.println (Sqstn [k]);
		    output.println (Sqstn2 [k]);
		    output.println (Sqstn3 [k]);
		    output.println (Sqstn4 [k]);
		    output.println (Sqstn5 [k]);
		    // display array information on the screen


		}
		output.close ();


	    }


	    catch (Exception r)
	    {
	    }
	}




	else if (e.getSource () == btnS14)
	{

	    JOptionPane.showMessageDialog (null, "TSK TSK! I THOUGHT YOU KNEW THIS! "); //wrong answer

	    try
	    {
		FileReader file = new FileReader ("ScienceQuestions.txt");
		BufferedReader input = new BufferedReader (file);
		String Sqstn[] = new String [1];
		String Sqstn2[] = new String [1];
		String Sqstn3[] = new String [1];
		String Sqstn4[] = new String [1];
		String Sqstn5[] = new String [1];

		for (int i = 0 ; i < Sqstn.length ; i++)
		{
		    Sqstn [i] = input.readLine ();
		    Sqstn2 [i] = input.readLine ();
		    Sqstn3 [i] = input.readLine ();
		    Sqstn4 [i] = input.readLine ();
		    Sqstn5 [i] = input.readLine ();




		    txtOutput5 = new TextField (Sqstn5 [i]);
		}
		input.close ();
		btnSci.setVisible (false);
		txtOutput.setVisible (false);
		txtOutput2.setVisible (false);
		txtOutput3.setVisible (false);
		txtOutput4.setVisible (false);


		repaint ();
		btnMath.setVisible (false);
		repaint ();
		frame.add (txtOutput5);
		txtOutput5.setBounds (100, 80, 300, 20);
		repaint ();
		btnS1.setVisible (false);
		btnS2.setVisible (false);
		btnS3.setVisible (false);
		btnS4.setVisible (false);
		btnS5.setVisible (false);
		btnS6.setVisible (false);
		btnS7.setVisible (false);
		btnS8.setVisible (false);
		btnS9.setVisible (false);
		btnS10.setVisible (false);
		btnS11.setVisible (false);
		btnS12.setVisible (false);
		btnS13.setVisible (false);
		btnS14.setVisible (false);
		btnS15.setVisible (false);
		btnS16.setVisible (false);
		btnS17.setVisible (true);
		btnS18.setVisible (true);
		btnS19.setVisible (true);
		btnS20.setVisible (true);

		FileWriter outFile = new FileWriter ("SCIQ.txt");
		PrintWriter output = new PrintWriter (outFile);




		// loop to store Questions into the new file.
		for (int k = 0 ; k < Sqstn.length ; k++)
		{
		    // write to the file
		    //output.println (qstn [k]);
		    output.println (Sqstn [k]);
		    output.println (Sqstn2 [k]);
		    output.println (Sqstn3 [k]);
		    output.println (Sqstn4 [k]);
		    output.println (Sqstn5 [k]);
		    // display array information on the screen


		}
		output.close ();


	    }


	    catch (Exception r)
	    {
	    }
	}




	else if (e.getSource () == btnS15)
	{

	    JOptionPane.showMessageDialog (null, "WOW, YOU GOT IT RIGHT!"); //right answer
	    highscore++;
	    try
	    {
		FileReader file = new FileReader ("ScienceQuestions.txt");
		BufferedReader input = new BufferedReader (file);
		String Sqstn[] = new String [1];
		String Sqstn2[] = new String [1];
		String Sqstn3[] = new String [1];
		String Sqstn4[] = new String [1];
		String Sqstn5[] = new String [1];

		for (int i = 0 ; i < Sqstn.length ; i++)
		{
		    Sqstn [i] = input.readLine ();
		    Sqstn2 [i] = input.readLine ();
		    Sqstn3 [i] = input.readLine ();
		    Sqstn4 [i] = input.readLine ();
		    Sqstn5 [i] = input.readLine ();




		    txtOutput5 = new TextField (Sqstn5 [i]);
		}
		input.close ();
		btnSci.setVisible (false);
		txtOutput.setVisible (false);
		txtOutput2.setVisible (false);
		txtOutput3.setVisible (false);
		txtOutput4.setVisible (false);


		repaint ();
		btnMath.setVisible (false);
		repaint ();
		frame.add (txtOutput5);
		txtOutput5.setBounds (100, 80, 300, 20);
		repaint ();
		btnS1.setVisible (false);
		btnS2.setVisible (false);
		btnS3.setVisible (false);
		btnS4.setVisible (false);
		btnS5.setVisible (false);
		btnS6.setVisible (false);
		btnS7.setVisible (false);
		btnS8.setVisible (false);
		btnS9.setVisible (false);
		btnS10.setVisible (false);
		btnS11.setVisible (false);
		btnS12.setVisible (false);
		btnS13.setVisible (false);
		btnS14.setVisible (false);
		btnS15.setVisible (false);
		btnS16.setVisible (false);
		btnS17.setVisible (true);
		btnS18.setVisible (true);
		btnS19.setVisible (true);
		btnS20.setVisible (true);

		FileWriter outFile = new FileWriter ("SCIQ.txt");
		PrintWriter output = new PrintWriter (outFile);




		// loop to store Questions into the new file.
		for (int k = 0 ; k < Sqstn.length ; k++)
		{
		    // write to the file
		    //output.println (qstn [k]);
		    output.println (Sqstn [k]);
		    output.println (Sqstn2 [k]);
		    output.println (Sqstn3 [k]);
		    output.println (Sqstn4 [k]);
		    output.println (Sqstn5 [k]);
		    // display array information on the screen


		}
		output.close ();


	    }


	    catch (Exception r)
	    {
	    }
	}




	else if (e.getSource () == btnS16)
	{

	    JOptionPane.showMessageDialog (null, "TSK TSK! I THOUGHT YOU KNEW THIS! "); //wrong answer

	    try
	    {
		FileReader file = new FileReader ("ScienceQuestions.txt");
		BufferedReader input = new BufferedReader (file);
		String Sqstn[] = new String [1];
		String Sqstn2[] = new String [1];
		String Sqstn3[] = new String [1];
		String Sqstn4[] = new String [1];
		String Sqstn5[] = new String [1];

		for (int i = 0 ; i < Sqstn.length ; i++)
		{
		    Sqstn [i] = input.readLine ();
		    Sqstn2 [i] = input.readLine ();
		    Sqstn3 [i] = input.readLine ();
		    Sqstn4 [i] = input.readLine ();
		    Sqstn5 [i] = input.readLine ();




		    txtOutput5 = new TextField (Sqstn5 [i]);
		}
		input.close ();
		btnSci.setVisible (false);
		txtOutput.setVisible (false);
		txtOutput2.setVisible (false);
		txtOutput3.setVisible (false);
		txtOutput4.setVisible (false);


		repaint ();
		btnMath.setVisible (false);
		repaint ();
		frame.add (txtOutput5);
		txtOutput5.setBounds (100, 80, 300, 20);
		repaint ();
		btnS1.setVisible (false);
		btnS2.setVisible (false);
		btnS3.setVisible (false);
		btnS4.setVisible (false);
		btnS5.setVisible (false);
		btnS6.setVisible (false);
		btnS7.setVisible (false);
		btnS8.setVisible (false);
		btnS9.setVisible (false);
		btnS10.setVisible (false);
		btnS11.setVisible (false);
		btnS12.setVisible (false);
		btnS13.setVisible (false);
		btnS14.setVisible (false);
		btnS15.setVisible (false);
		btnS16.setVisible (false);
		btnS17.setVisible (true);
		btnS18.setVisible (true);
		btnS19.setVisible (true);
		btnS20.setVisible (true);

		FileWriter outFile = new FileWriter ("SCIQ.txt");
		PrintWriter output = new PrintWriter (outFile);




		// loop to store Questions into the new file.
		for (int k = 0 ; k < Sqstn.length ; k++)
		{
		    // write to the file
		    //output.println (qstn [k]);
		    output.println (Sqstn [k]);
		    output.println (Sqstn2 [k]);
		    output.println (Sqstn3 [k]);
		    output.println (Sqstn4 [k]);
		    output.println (Sqstn5 [k]);
		    // display array information on the screen


		}
		output.close ();


	    }


	    catch (Exception r)
	    {
	    }
	}
	else if (e.getSource () == btnS17)
	{

	    JOptionPane.showMessageDialog (null, "THIS WAS SO EASY, BUT I GUESS YOU GOT IT WRONG! "); //wrong answer
	    JOptionPane.showMessageDialog (null, "YOU FINISHED THE QUIZ! \nYou can check the Questions written In the SCIQ.txt file \nTo view Highscore Finish both of the Quizes  "); //end

	    btnSci.setVisible (true);
	    btnMath.setVisible (true);
	    txtOutput.setVisible (false);
	    txtOutput2.setVisible (false);
	    txtOutput3.setVisible (false);
	    txtOutput4.setVisible (false);
	    txtOutput5.setVisible (false);



	    repaint ();

	    btnS1.setVisible (false);
	    btnS2.setVisible (false);
	    btnS3.setVisible (false);
	    btnS4.setVisible (false);
	    btnS5.setVisible (false);
	    btnS6.setVisible (false);
	    btnS7.setVisible (false);
	    btnS8.setVisible (false);
	    btnS9.setVisible (false);
	    btnS10.setVisible (false);
	    btnS11.setVisible (false);
	    btnS12.setVisible (false);
	    btnS13.setVisible (false);
	    btnS14.setVisible (false);
	    btnS15.setVisible (false);
	    btnS16.setVisible (false);
	    btnS17.setVisible (false);
	    btnS18.setVisible (false);
	    btnS19.setVisible (false);
	    btnS20.setVisible (false);





	}


	else if (e.getSource () == btnS18)
	{

	    JOptionPane.showMessageDialog (null, "THIS WAS SO EASY, BUT I GUES YOU GOT IT WRONG! "); //wrong answer
	    JOptionPane.showMessageDialog (null, "YOU FINISHED THE QUIZ! \nYou can check the Questions written In the SCIQ.txt file \nTo view Highscore Finish both of the Quizes  "); //end

	    btnSci.setVisible (true);
	    btnMath.setVisible (true);
	    txtOutput.setVisible (false);
	    txtOutput2.setVisible (false);
	    txtOutput3.setVisible (false);
	    txtOutput4.setVisible (false);
	    txtOutput5.setVisible (false);



	    repaint ();

	    btnS1.setVisible (false);
	    btnS2.setVisible (false);
	    btnS3.setVisible (false);
	    btnS4.setVisible (false);
	    btnS5.setVisible (false);
	    btnS6.setVisible (false);
	    btnS7.setVisible (false);
	    btnS8.setVisible (false);
	    btnS9.setVisible (false);
	    btnS10.setVisible (false);
	    btnS11.setVisible (false);
	    btnS12.setVisible (false);
	    btnS13.setVisible (false);
	    btnS14.setVisible (false);
	    btnS15.setVisible (false);
	    btnS16.setVisible (false);
	    btnS17.setVisible (false);
	    btnS18.setVisible (false);
	    btnS19.setVisible (false);
	    btnS20.setVisible (false);


	}
	else if (e.getSource () == btnS19)
	{

	    JOptionPane.showMessageDialog (null, "CORRECT, OK GOOD JOB!!!!"); //right answer
	    JOptionPane.showMessageDialog (null, "YOU FINISHED THE QUIZ! \nYou can check the Questions written In the SCIQ.txt file \nTo view Highscore Finish both of the Quizes  "); //end
	    highscore++;
	    try
	    {
		FileReader file = new FileReader ("ScienceQuestions.txt");
		BufferedReader input = new BufferedReader (file);
		String Sqstn[] = new String [1];
		String Sqstn2[] = new String [1];
		String Sqstn3[] = new String [1];
		String Sqstn4[] = new String [1];
		String Sqstn5[] = new String [1];

		for (int i = 0 ; i < Sqstn.length ; i++)
		{
		    Sqstn [i] = input.readLine ();
		    Sqstn2 [i] = input.readLine ();
		    Sqstn3 [i] = input.readLine ();
		    Sqstn4 [i] = input.readLine ();
		    Sqstn5 [i] = input.readLine ();





		}
		btnSci.setVisible (true);
		btnMath.setVisible (true);
		txtOutput.setVisible (false);
		txtOutput2.setVisible (false);
		txtOutput3.setVisible (false);
		txtOutput4.setVisible (false);
		txtOutput5.setVisible (false);



		repaint ();

		btnS1.setVisible (false);
		btnS2.setVisible (false);
		btnS3.setVisible (false);
		btnS4.setVisible (false);
		btnS5.setVisible (false);
		btnS6.setVisible (false);
		btnS7.setVisible (false);
		btnS8.setVisible (false);
		btnS9.setVisible (false);
		btnS10.setVisible (false);
		btnS11.setVisible (false);
		btnS12.setVisible (false);
		btnS13.setVisible (false);
		btnS14.setVisible (false);
		btnS15.setVisible (false);
		btnS16.setVisible (false);
		btnS17.setVisible (false);
		btnS18.setVisible (false);
		btnS19.setVisible (false);
		btnS20.setVisible (false);



	    }


	    catch (Exception r)
	    {
	    }


	}






	else if (e.getSource () == btnS20)
	{

	    JOptionPane.showMessageDialog (null, "THIS WAS SO EASY, BUT I GUES YOU GOT IT WRONG! "); //wrong answer
	    JOptionPane.showMessageDialog (null, "YOU FINISHED THE QUIZ! \nYou can check the Questions written In the SCIQ.txt file \nTo view Highscore Finish both of the Quizes  "); //end


	    btnSci.setVisible (true);
	    btnMath.setVisible (true);
	    txtOutput.setVisible (false);
	    txtOutput2.setVisible (false);
	    txtOutput3.setVisible (false);
	    txtOutput4.setVisible (false);
	    txtOutput5.setVisible (false);



	    repaint ();

	    btnS1.setVisible (false);
	    btnS2.setVisible (false);
	    btnS3.setVisible (false);
	    btnS4.setVisible (false);
	    btnS5.setVisible (false);
	    btnS6.setVisible (false);
	    btnS7.setVisible (false);
	    btnS8.setVisible (false);
	    btnS9.setVisible (false);
	    btnS10.setVisible (false);
	    btnS11.setVisible (false);
	    btnS12.setVisible (false);
	    btnS13.setVisible (false);
	    btnS14.setVisible (false);
	    btnS15.setVisible (false);
	    btnS16.setVisible (false);
	    btnS17.setVisible (false);
	    btnS18.setVisible (false);
	    btnS19.setVisible (false);
	    btnS20.setVisible (false);




	}


	else if (e.getSource () == btnClear)
	{

	    System.exit (0);
	}
	else if (e.getSource () == btnScore)
	{

	    for (int z = 0 ; z < 1 ; z++)
	    {
		JOptionPane.showMessageDialog (null, " Name: " + name2 [z] + "\n" + "Your Score : " + highscore + "/10");//displays player score
	    }


	}
	else if (e.getSource () == btnHScore)
	{

	    try
	    {
		//reading from file
		FileReader cfile = new FileReader ("HighScore.txt");
		BufferedReader cinput = new BufferedReader (cfile);

		//split method
		String lineOfTextRead;

		for (int i = 0 ; i < 5 ; i++)
		{

		    lineOfTextRead = cinput.readLine ();
		    String dText[] = lineOfTextRead.split (",");
		    name [i] = dText [0];
		    score [i] = Integer.parseInt (dText [1]);

		}
	    }
	    catch (Exception r)
	    {
	    }
	    for (int i = 0 ; i < name.length ; i++) //sorting
	    {
		for (int j = 0 ; j < name.length - 1 ; j++) //loop trhough elements
		{
		    if (score [j] < score [j + 1])
		    {
			//sorting score
			int tempScore = score [j];
			score [j] = score [j + 1];
			score [j + 1] = tempScore;

			//sort names
			String tempNames = name [j];
			name [j] = name [j + 1];
			name [j + 1] = tempNames;




		    }

		}

	    }


	    System.out.println ("ALL HIGHSCORES ARE A TOTAL OF MATH AND SCIENCE SCORES");//displaying information

	    for (int n = 0 ; n < 5 ; n++)
	    {
		System.out.println (" Name: " + name [n] + "\n" + " Score : " + score [n]);

	    }
	    try
	    {
		String findMe; // string to store name to find
		BufferedReader player = new BufferedReader (new InputStreamReader (System.in));//prompt for inputting name
		System.out.println ("Enter the player to find thier stats");

		findMe = player.readLine ();



		int loc;

		loc = findName (findMe, name); // call find method with array and name

		if (loc >= 0)
		{
		    System.out.println ("Name :" + name [loc] + "\n" + "Score : " + score [loc]);//if name was found
		}


		else
		{
		    System.out.println (findMe + " not found");//if name not found
		}




		PrintWriter output = new PrintWriter (new FileWriter ("HighScore.txt ")); // write to outputFile.txt

		for (int i = 0 ; i < 1 ; i++)
		{
		    //loop through to compare two elements next to each other
		    for (int j = 0 ; j < 1 ; j++)
		    {


			score2 [j] = highscore;

			//check if your score is greater than score 1
			if (score2 [j] > score [0])
			{
			    // swap goals if not in incresing order
			    int tempScore = score2 [j];
			    score2 [j] = score [j];
			    score [j] = tempScore;
			    // swap names to keep lists correct
			    String tempName = name2 [i];
			    name2 [j] = name [j];
			    name [j] = tempName;

			    for (int a = 0 ; a < 5 ; a++)
			    {
				output.println (name [a] + "," + score [a]); // print to outputFile.txt the updated version

			    }
			}

		    }
		}

		for (int i = 0 ; i < 1 ; i++)
		{
		    //check if your score is greater than score 2 but less than score 1 and print new list
		    if ((score2 [i] > score [1]) && (score2 [i] < score [0]))
		    {
			//compare one element to the next
			int tempScore = score2 [i];
			score2 [i] = score [i + 1];
			score [i + 1] = tempScore;
			// swap names to keep lists correct
			String tempName = name2 [i];
			name2 [i] = name [i + 1];
			name [i + 1] = tempName;
			for (int a = 0 ; a < 5 ; a++)
			{
			    output.println (name [a] + "," + score [a]);
			}

		    }
		    //loop through to compare two elements next to each other
		    for (int k = 0 ; k < 1 ; k++)
		    {
			//check if your score is greater than score 3 but less than score 2 and print new list
			if ((score2 [k] > score [2]) && (score2 [k] < score [1]))
			{
			    //compare one element to the next
			    int tempScore = score2 [k];
			    score2 [k] = score [k + 2];
			    score [k + 2] = tempScore;
			    // swap names to keep lists correct
			    String tempName = name2 [k];
			    name2 [k] = name [k + 2];
			    name [k + 2] = tempName;
			    for (int a = 0 ; a < 5 ; a++)
			    {
				output.println (name [a] + "," + score [a]);
			    }
			}

		    }
		    //loop through to compare two elements next to each other
		    for (int w = 0 ; w < 1 ; w++)
		    {
			//check if your score is greater than score 4 but less than score 3 and print new list
			if ((score2 [w] > score [3]) && (score2 [w] < score [2]))
			{
			    //compare one element to the next
			    int tempScore3 = score2 [w];
			    score2 [w] = score [w + 3];
			    score [w + 3] = tempScore3;
			    // swap names to keep lists correct
			    String tempName3 = name2 [w];
			    name2 [w] = name [w + 3];
			    name [w + 3] = tempName3;
			    for (int a = 0 ; a < 5 ; a++)
			    {
				output.println (name [a] + "," + score [a]);
			    }
			}

		    }
		    //loop through to compare two elements next to each other
		    for (int q = 0 ; q < 1 ; q++)
		    {
			//check if your score is greater than score 5 but less than score 4 and print new list
			if ((score2 [q] > score [4]) && (score2 [q] < score [3]))
			{
			    //compare one element to the next
			    int tempScore3 = score2 [q];
			    score2 [q] = score [q + 4];
			    score [q + 4] = tempScore3;
			    // swap names to keep lists correct
			    String tempName3 = name2 [q];
			    name2 [q] = name [q + 4];
			    name [q + 4] = tempName3;
			    for (int a = 0 ; a < 5 ; a++)
			    {
				output.println (name [a] + "," + score [a]);
			    }
			}

		    }
		    for (int l = 0 ; l < 1 ; l++)
		    {
			//check if your score is less that score number 5 and print new list
			if ((score2 [l] < score [4]))
			{

			    for (int a = 0 ; a < 5 ; a++)
			    {
				output.println (name [a] + "," + score [a]);
			    }
			}


		    }
		    System.out.println ("Restart and play the game again to view Updated version of Highscores");
		}

		output.close (); // close the file
	    }
	    catch (Exception r)
	    {
	    }


	}
    }


    public static int findName (String nameToFind, String array[])
    {
	int place = -1;   // place is negative if not found

	// loop through array
	for (int i = 0 ; i < array.length ; i++)
	{
	    //check if name to find is equal to current array element
	    if (nameToFind.equalsIgnoreCase (array [i]) == true)
	    {
		place = i;  // store location of name in array
	    }
	}


	return place;   // return location
    } // fineName method


    public void paint (Graphics g)
    {
	backGnd.paintIcon (this, g, 0, 0);
	g.setColor (Color.white);
	g.drawString ("score " + highscore, 40, 60); // showing score
    }




    public static void main (String[] args)
    {
	new TRIVIA ();


	// Place your code here
    } // main method





} // TRIVIA class


