package sg.edu.rp.c346.project03_v1;

public class Answer {
    private int champion;
    private int ultimate;
    private String name;

    public Answer(int champion, int ultimate, String name) {
        this.champion = champion;
        this.ultimate = ultimate;
        this.name = name;
    }

    public int getChampion() {
        return champion;
    }

    public void setChampion(int champion) {
        this.champion = champion;
    }

    public int getUltimate() {
        return ultimate;
    }

    public void setUltimate(int ultimate) {
        this.ultimate = ultimate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
