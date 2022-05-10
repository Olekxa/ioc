package application;

public class Question {
    private Answer answer;

    public Question() {
        this.answer = new Answer();
    }

    public String getAnswer() {
        return answer.getAnswer();
    }
}
