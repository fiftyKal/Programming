package week4;

public class VotingMachine {
    // Attributes
    private int numberYesVotes;
    private int numberNoVotes;
    private String nameOfIssue;

    // Constructor
    public VotingMachine(int numberYesVotes, int numberNoVotes, String nameOfIssue) {
        this.numberYesVotes = numberYesVotes;
        this.numberNoVotes = numberNoVotes;
        this.nameOfIssue = nameOfIssue;
    }
    // Other Methods
    public void voteYes() {
        this.numberYesVotes++;
        }

    public void voteNo() {
        this.numberNoVotes++;
        }

    public void returnYesCount() {
        this.numberYesVotes = numberYesVotes;
        }

    public void returnNoCount() {
            this.numberNoVotes = numberNoVotes;
        }
    public void clearMachine() {
        numberYesVotes = 0;
        numberNoVotes = 0;
    }
    public String toString() {
        return "Yes: " + numberYesVotes + " No: " + numberNoVotes;
    }
}
