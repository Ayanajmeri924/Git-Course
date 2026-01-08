package QuizProject;

import java.util.Scanner;

public class QuestionService {
    Question[] question=new Question[5];
    String []selection=new String[question.length];

    QuestionService(){
        question[0]=new Question(1,"what","java","python","c","go","java");

        question[1]=new Question(2,"am","java","python","c","go","java");

        question[2]=new Question(3,"i","java","python","c","go","java");

        question[3]=new Question(4,"doing","java","python","c","go","java");

        question[4]=new Question(5,"ayan","java","python","c","go","java");
    }

    public void displayQuestion(){
        // for(int i=0;i<question.length;i++){
        //     System.out.println(question[i].getQuestion());
        // }
        for(Question q:question){
            // System.out.println(q.getQuestion());
            System.out.println(q);
        }
    }

    public void playQuiz(){
        int a=1;int sel=0;
        for(Question q: question){

            System.out.println("Question no . "+q.getId());
            System.out.println("Q"+a++ +". "+q.getQuestion());

            // System.out.println("");
            String[] options=q.getOpt();

            char ascii='a';
            for(int i=0;i<options.length;i++){
                System.out.println(ascii++ +": "+options[i]);
            }

            System.out.println();
            Scanner in=new Scanner(System.in);
            System.out.println("Type Answer: ");
            selection[sel++]=in.nextLine();

        }
        System.out.println();
        for(int j=0;j<selection.length;j++){
            System.out.println(selection[j]);
        }
    }

    public void printScore(){
        int score=0;
        for(int i=0;i<question.length;i++){
            Question ques=question[i];
            String ActualAns=ques.getAnswer();
            String userAns=selection[i];
            if(ActualAns.equals(userAns)){
                score++;
            }

        
        }
        System.out.println("Score = "+score+" Out of "+question.length+" questions");

    }

}
