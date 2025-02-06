/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.model;

/**
 *
 * @author ELOHOME LTD
 */
public class Questions {   
    
     private Long questionId;
    
    private String title;
    private String option1;
    private String option2;
    private String option3;
    private String answer;   
    private Assessment asses;

    public Questions() {
    }

    public Questions(Long questionId, String title, String option1, String option2, String option3, String answer, Assessment asses) {
        this.questionId = questionId;
        this.title = title;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.answer = answer;
        this.asses = asses;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public String getOption3() {
        return option3;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Assessment getAsses() {
        return asses;
    }

    public void setAsses(Assessment asses) {
        this.asses = asses;
    }
    
}
