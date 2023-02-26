public class Main {
    public static void main(String[] args) {
        for (int i=1; i<=5; i++){
            LPAStudent s = new LPAStudent("EB4567" + i,
                    switch (i){
                        case 1 -> "Ervin";
                        case 2 -> "Nick";
                        case 3 -> "Diyas";
                        case 4 -> "Bogdan";
                        case 5 -> "Johny";
                        default -> "Anonymous";
                    },
                    "26/05/00",
                    "Computer Science");
            System.out.println(s);
        }

        // using pojo
        Student pojoStudent = new Student("EB45676","Ann",
                "26/05/00","Computer Science");

        // using record
        LPAStudent recordStudent = new LPAStudent("EB45677","Bill",
                "26/05/00","Computer Science");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setCourse(pojoStudent.getCourse() + ", Java OCP Exam 829");
        // recordStudent.setCourse(pojoStudent.getCourse() + ", Java OCP Exam 829");

        System.out.println(pojoStudent.getName() + " is taking: "
                + pojoStudent.getCourse());

        System.out.println(recordStudent.name() + " is taking: "
                + recordStudent.course());


    }
}
