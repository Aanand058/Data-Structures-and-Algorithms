package Data_Structures_and_Algorithms.Student_Exam_Manager_Application;

public class ExamNode {
    String examDetails;
    ExamNode next;
    ExamNode prev;

    public ExamNode(String examDetails) {
        this.examDetails = examDetails;
        this.next = null;
        this.prev = null;
    }
}

