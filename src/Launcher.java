import view.MainFrame;

public class Launcher {
    public static void main(String args[]){

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame();
            }
            ;

        });
    }
}
