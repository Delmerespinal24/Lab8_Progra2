package lab8_delmerizaguirreprogra2;

import javax.swing.JProgressBar;

public class HiloBatalla extends Thread {

    private JProgressBar p1, p2;
    private Hada jugador1, jugador2;

    public HiloBatalla(JProgressBar p1, JProgressBar p2, Hada player1, Hada player2) {
        this.p1 = p1;
        this.p2 = p2;
        this.jugador1 = player1;
        this.jugador2 = player2;
    }

    public Hada getPlayer1() {
        return jugador1;
    }

    public void setPlayer1(Hada player1) {
        this.jugador1 = player1;
    }

    public Hada getPlayer2() {
        return jugador2;
    }

    public void setPlayer2(Hada player2) {
        this.jugador2 = player2;
    }

    @Override
    public String toString() {
        return "ThreadBatallas{" + "player1=" + jugador1 + ", player2=" + jugador2 + '}';
    }

    private boolean runs = true;
    private boolean vive = true;

    public boolean isRuns() {
        return runs;
    }

    public void setRuns(boolean runs) {
        this.runs = runs;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    @Override
    public void run() {
        while (vive) {
            if (runs) {
                if (jugador1 instanceof Salamandras && ((jugador2 instanceof Hamadriades))) {
                    jugador2.setSalud((int) (jugador2.getSalud() - (jugador1.getPoder() + (jugador1.getPoder() * 0.37))));
                } else if (((jugador1 instanceof Lamias) || (jugador1 instanceof Silfides)) && (jugador2 instanceof Hamadriades)) {
                    if (jugador1 instanceof Lamias) {
                        jugador2.setSalud((int) (jugador2.getSalud() - (jugador1.getPoder() + (jugador1.getPoder() * 0.42))));
                    }
                    if (jugador1 instanceof Silfides) {
                        jugador2.setSalud((int) (jugador2.getSalud() - (jugador1.getPoder() + (jugador1.getPoder() * 0.37))));
                    }
                } else {
                    jugador2.setSalud(jugador2.getSalud() - (jugador1.getPoder()));
                }
                if (jugador2 instanceof Salamandras && ((jugador1 instanceof Hamadriades))) {
                    jugador1.setSalud((int) (jugador1.getSalud() - (jugador1.getPoder() + (jugador2.getPoder() * 0.37))));
                } else if (((jugador2 instanceof Lamias) || (jugador2 instanceof Silfides)) && (jugador1 instanceof Hamadriades)) {
                    if (jugador2 instanceof Lamias) {
                        jugador1.setSalud((int) (jugador1.getSalud() - (jugador2.getPoder() + (jugador2.getPoder() * 0.42))));
                    }
                    if (jugador2 instanceof Silfides) {
                        jugador1.setSalud((int) (jugador1.getSalud() - (jugador2.getPoder() + (jugador2.getPoder() * 0.37))));
                    }
                } else {
                    jugador1.setSalud(jugador1.getSalud() - (jugador2.getPoder()));
                }
                p1.setValue(jugador1.getSalud());
                p2.setValue(jugador2.getSalud());
                
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            }
        }
    }

}
