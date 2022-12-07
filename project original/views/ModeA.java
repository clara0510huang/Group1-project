package views;

import java.util.Scanner;
/*
 * Class Mode.  A Mode will be used to ask if user is willing to change to vision accessibility mode or changing speed
 */


public class ModeA {

    /*
     * Initializing mode object and receiving user inputs to determine following actions.
     */


    public ModeA(TetrisView view) {

        Scanner obj = new Scanner(System.in);

        System.out.println("Are you a vision accessibility user ? (yes/no)");
        if (obj.hasNextLine()) {
            String answer = obj.nextLine();
            if (answer.equalsIgnoreCase("yes")) {
                System.out.println("The speed was " + view.timeline.getRate()); //1.2
                System.out.println("The size was " + view.gameModeLabel.getFont().getSize()); //20
                VisionAccessibilityVisitor vis = new VisionAccessibilityVisitor();
                Speed spd = new Speed(view);
                Font ft = new Font(view);
                spd.Accept(vis);
                ft.Accept(vis);


            } else {
                System.out.println("Do you want to change the speed ?(yes/no)");
                String answer2 = obj.nextLine();
                if (answer2.equalsIgnoreCase("yes")) {
                    System.out.println("enter number between 0.5 - 4");
                    Speed spd = new Speed(view);
                    spd.setSpeed(obj.nextDouble());
                } else {
                    System.out.println("Executing normal version");
                }

            }
        }
    }
}
