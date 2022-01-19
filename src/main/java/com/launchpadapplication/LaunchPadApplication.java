    package com.launchpadapplication;
    
    /*
     * @author COEBE AUSTIN LUPAC
     * @version 16
     * @copyright
     * @since 2021
     */
    
    import javax.swing.*;
    import java.awt.*;
    import java.io.*;
    import java.awt.event.*;
    import javax.sound.sampled.AudioSystem;
    import javax.sound.sampled.Clip;
    import javax.sound.sampled.LineUnavailableException;
    import javax.sound.sampled.UnsupportedAudioFileException;
    
    public class LaunchPadApplication extends JFrame {
    
        /**
         * Creates new LaunchPad
         */
        public LaunchPadApplication() {
            initComponents();
        }
    
        /**
         * This method is called from within the constructor to initialize the form.
         *
         *
         */
        @SuppressWarnings("unchecked")
    
        private void initComponents() {
    
            // components of the program
            jPanel1 = new JPanel();
            smallTom = new JButton();
            chinaCymbalCrash = new JButton();
            rideCymbal = new JButton();
            floorTom = new JButton();
            hiHatClosed = new JButton();
            hiHatOpen = new JButton();
            mediumTom = new JButton();
            splashCymbal1 = new JButton();
            crashCymbal = new JButton();
            snare = new JButton();
            bass = new JButton();
            splash = new JButton();
    
            //  closes the window
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setBackground(new Color(0, 0, 0));
    
            //  sets the background for the panel
            jPanel1.setBackground(new Color(0, 0, 0));
    
            // background, appearance, and action of Small Toms Button
            smallTom.setBackground(new Color(255, 0, 51));
            smallTom.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent evt) {
                    smallTomMouseClicked(evt);
                }
            });
    
            // background, appearance, and action of China Cymbal crash
            chinaCymbalCrash.setBackground(new Color(255, 0, 51));
            chinaCymbalCrash.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent evt) {
                    chinaCymbalCrashMouseClicked(evt);
                }
            });
    
            // background, appearance, and action of Ride Cymbal
            rideCymbal.setBackground(new Color(255, 102, 0));
            rideCymbal.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent evt) {
                    rideCymbalMouseClicked(evt);
                }
            });
    
            // background, appearance, and action of Floor Toms
            floorTom.setBackground(new Color(255, 0, 51));
            floorTom.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent evt) {
                    floorTomMouseClicked(evt);
                }
            });
    
            // background, appearance, and action of Closed HiHats
            hiHatClosed.setBackground(new Color(255, 102, 0));
            hiHatClosed.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent evt) {
                    hiHatClosedMouseClicked(evt);
                }
            });
    
            // background, appearance, and action of Open HiHats
            hiHatOpen.setBackground(new Color(255, 0, 51));
            hiHatOpen.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent evt) {
                    hiHatOpenMouseClicked(evt);
                }
            });
    
            // background, appearance, and action of Medium Toms
            mediumTom.setBackground(new Color(255, 102, 0));
            mediumTom.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent evt) {
                    mediumTomMouseClicked(evt);
                }
            });
    
            // background, appearance, and action of Splash Cymbal 1
            splashCymbal1.setBackground(new Color(255, 102, 0));
            splashCymbal1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent evt) {
                    splashCymbal1MouseClicked(evt);
                }
            });
    
            // background, appearance, and action of Crash Cymbal
            crashCymbal.setBackground(new java.awt.Color(0, 255, 255));
            crashCymbal.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent evt) {
                    crashCymbalMouseClicked(evt);
                }
            });
    
            // background, appearance, and action of Snare Drum
            snare.setBackground(new Color(0, 255, 255));
            snare.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent evt) {
                    snareMouseClicked(evt);
                }
            });
    
            // background, appearance, and action of Bass
            bass.setBackground(new Color(0, 255, 255));
            bass.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent evt) {
                    bassMouseClicked(evt);
                }
            });
    
            // background, appearance, and action of Splash
            splash.setBackground(new Color(0, 255, 255));
            splash.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent evt) {
                    splashMouseClicked(evt);
                }
            });
    
            /*
             * These blocks of codes are responsible for the panel, positioning,
             * and alignment of the buttons
             *
             */
            GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                    jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(148, 148, 148)
                                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                    .addComponent(crashCymbal, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(rideCymbal, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE))
                                            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                    .addComponent(snare, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(hiHatClosed, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE))
                                            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                    .addComponent(bass, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(mediumTom, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE))
                                            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                    .addComponent(splash, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(splashCymbal1, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                            .addComponent(smallTom, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(chinaCymbalCrash, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(floorTom, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(hiHatOpen, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE))
                                    .addContainerGap(154, Short.MAX_VALUE))
            );
            jPanel1Layout.setVerticalGroup(
                    jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addContainerGap(39, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                            .addComponent(rideCymbal, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(hiHatOpen, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(crashCymbal, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                            .addComponent(chinaCymbalCrash, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(hiHatClosed, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(snare, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                            .addComponent(floorTom, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(mediumTom, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(bass, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                            .addComponent(smallTom, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(splashCymbal1, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(splash, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
                                    .addGap(34, 34, 34))
            );
    
            GroupLayout layout = new GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                    layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                    layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))
            );
    
            pack();
        }// </editor-fold>                        
    
        //private void (method names) are methods whenever the generated button is clicked
        private void smallTomMouseClicked(MouseEvent evt) {
            try {
                Clip smallTomClip = AudioSystem.getClip();
                smallTomClip.open(AudioSystem.getAudioInputStream(this.getClass().getResource("/SmallTom.wav")));
                smallTomClip.start();
            } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
                System.out.println("Cannot play");
            }
        }
    
        private void chinaCymbalCrashMouseClicked(MouseEvent evt) {
            try {
                Clip chinaCymbalClip = AudioSystem.getClip();
                chinaCymbalClip.open(AudioSystem.getAudioInputStream(this.getClass().getResource("/ChinaCymbalCrash.wav")));
                chinaCymbalClip.start();
            } catch (IOException | LineUnavailableException | UnsupportedAudioFileException ex) {
                System.out.println("Cannot play");
            }
        }
    
        private void rideCymbalMouseClicked(MouseEvent evt) {
            try {
                //File crashCymbalSound = new File(".\\src\\com\\launchpadsounds\\RideCymbal.wav");
                Clip crashCymbalClip = AudioSystem.getClip();
                crashCymbalClip.open(AudioSystem.getAudioInputStream(this.getClass().getResource("/RideCymbal.wav")));
                crashCymbalClip.start();
            } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
                System.out.println("Cannot play");
            }
        }
    
        private void floorTomMouseClicked(MouseEvent evt) {
            try {
                Clip floorTomClip = AudioSystem.getClip();
                floorTomClip.open(AudioSystem.getAudioInputStream(this.getClass().getResource("/FloorTom.wav")));
                floorTomClip.start();
            } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
                System.out.println("Cannot play");
            }
        }
    
        private void hiHatClosedMouseClicked(MouseEvent evt) {
            try {
                Clip hiHatClosedClip = AudioSystem.getClip();
                hiHatClosedClip.open(AudioSystem.getAudioInputStream(this.getClass().getResource("/HiHatClosed.wav")));
                hiHatClosedClip.start();
            } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
                System.out.println("Cannot play");
            }
        }
    
        private void hiHatOpenMouseClicked(MouseEvent evt) {
            try {
                Clip hiHatOpenClip = AudioSystem.getClip();
                hiHatOpenClip.open(AudioSystem.getAudioInputStream(this.getClass().getResource("/HiHatOpen.wav")));
                hiHatOpenClip.start();
            } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
                System.out.println("Cannot play");
            }
        }
    
        private void mediumTomMouseClicked(MouseEvent evt) {
            try {
                Clip mediumTomClip = AudioSystem.getClip();
                mediumTomClip.open(AudioSystem.getAudioInputStream(this.getClass().getResource("/MediumTom.wav")));
                mediumTomClip.start();
            } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
                System.out.println("Cannot play");
            }
        }
    
        private void splashCymbal1MouseClicked(MouseEvent evt) {
            try {
                Clip splashCymbalClip = AudioSystem.getClip();
                splashCymbalClip.open(AudioSystem.getAudioInputStream(this.getClass().getResource("/SplashCymbal1.wav")));
                splashCymbalClip.start();
            } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
                System.out.println("Cannot play");
            }
        }
    
        private void crashCymbalMouseClicked(MouseEvent evt) {
            try {
                Clip soundClip9 = AudioSystem.getClip();
                soundClip9.open(AudioSystem.getAudioInputStream(this.getClass().getResource("/CrashCymbal.wav")));
                soundClip9.start();
            } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
                System.out.println("Cannot play");
            }
        }
    
        private void snareMouseClicked(MouseEvent evt) {
            try {
                Clip soundClip10 = AudioSystem.getClip();
                soundClip10.open(AudioSystem.getAudioInputStream(this.getClass().getResource("/SnareDrum.wav")));
                soundClip10.start();
            } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
                System.out.println("Cannot play");
            }
        }
    
        private void bassMouseClicked(MouseEvent evt) {
            try {
                Clip soundClip11 = AudioSystem.getClip();
                soundClip11.open(AudioSystem.getAudioInputStream(this.getClass().getResource("/Bass.wav")));
                soundClip11.start();
            } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
                System.out.println("Cannot play");
            }
        }
    
        private void splashMouseClicked(MouseEvent evt) {
            try {
                Clip soundClip12 = AudioSystem.getClip();
                soundClip12.open(AudioSystem.getAudioInputStream(this.getClass().getResource("/SplashCymbal.wav")));
                soundClip12.start();
            } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
                System.out.println("Cannot play");
            }
        }
    
    
        /**
         * @param args the command line arguments
         */
        public static void main(String args[]) {
    
            /* Create and display the form */
            EventQueue.invokeLater(() -> {
                new LaunchPadApplication().setVisible(true);
            });
        }
    
        // Variables declaration - do not modify                     
        private JButton bass;
        private JButton crashCymbal;
        private JButton splashCymbal1;
        private JPanel jPanel1;
        private JButton mediumTom;
        private JButton hiHatClosed;
        private JButton rideCymbal;
        private JButton hiHatOpen;
        private JButton chinaCymbalCrash;
        private JButton floorTom;
        private JButton smallTom;
        private JButton snare;
        private JButton splash;
        // End of variables declaration                   
    }
