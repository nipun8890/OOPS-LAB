package Experiment5;
class playerclass {
    String name;
    int age;
    String position;

    public playerclass(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    public void play() {
        System.out.println(name + " is playing.");
    }

    public void train() {
        System.out.println(name + " is training.");
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Position: " + position;
    }
}

class Cricket_Player extends playerclass {
    int runs;
    int wickets;

    public Cricket_Player(String name, int age, String position, int runs, int wickets) {
        super(name, age, position);
        this.runs = runs;
        this.wickets = wickets;
    }

    @Override
    public void play() {
        System.out.println(name + " is playing cricket.");
    }

    @Override
    public void train() {
        System.out.println(name + " is practicing batting and bowling.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Runs: " + runs + ", Wickets: " + wickets;
    }
}

class Football_Player extends playerclass {
    int goals;
    int assists;

    public Football_Player(String name, int age, String position, int goals, int assists) {
        super(name, age, position);
        this.goals = goals;
        this.assists = assists;
    }

    @Override
    public void play() {
        System.out.println(name + " is playing football.");
    }

    @Override
    public void train() {
        System.out.println(name + " is practicing dribbling and shooting.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Goals: " + goals + ", Assists: " + assists;
    }
}

class Hockey_Player extends playerclass {
    int goals;
    int assists;

    public Hockey_Player(String name, int age, String position, int goals, int assists) {
        super(name, age, position);
        this.goals = goals;
        this.assists = assists;
    }

    @Override
    public void play() {
        System.out.println(name + " is playing hockey.");
    }

    @Override
    public void train() {
        System.out.println(name + " is practicing stick handling and shooting.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Goals: " + goals + ", Assists: " + assists;
    }

    public static void main(String[] args) {
        Cricket_Player virat = new Cricket_Player("Virat Kohli", 35, "Batsman", 12000, 250);
        Football_Player messi = new Football_Player("Lionel Messi", 36, "Forward", 800, 350);
        Hockey_Player rani = new Hockey_Player("Rani Rampal", 29, "Forward", 150, 75);

        System.out.println(virat); // Prints using the overridden toString()
        virat.play();
        virat.train();

        System.out.println(messi);
        messi.play();
        messi.train();

        System.out.println(rani);
        rani.play();
        rani.train();
    }
}