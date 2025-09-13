package app;

import java.util.Scanner;

public class TicketCounterStack {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Stack st = null;

        System.out.println("Choose initialization:");
        System.out.println("1. Empty stack with size");
        System.out.println("2. Stack initialized with array of Persons");
        int choice = sc.nextInt();

        if (choice == 1) {
         System.out.print("Enter size: ");
         int size = sc.nextInt();
         st = new Stack(size);
      } else if (choice == 2) {
            System.out.print("Enter number of Persons: ");
            int n = sc.nextInt();
            Person[] arr = new Person[n];
            for (int i = 0; i < n; i++) {
                sc.nextLine();
            System.out.print("Enter name: ");
            String name = sc.nextLine();
                System.out.print("Enter age: ");
                int age = sc.nextInt();
                System.out.print("Enter gender (MALE/FEMALE/OTHER): ");
                String g = sc.next();
                Gender gender = Gender.valueOf(g.toUpperCase());
                arr[i] = new Person(name, age, gender);
            }
            st = new Stack(arr);
        }

        int option;
        do {
            System.out.println("\n Menu ");
            System.out.println("1. Push one Person");
            System.out.println("2. Push two Persons");
            System.out.println("3. Pop one Person");
            System.out.println("4. Pop multiple Persons");
            System.out.println("5. Display all Persons");
            System.out.println("6. Display top n Persons");
            System.out.println("7. Exit");
            option = sc.nextInt();

            switch(option) {
                case 1:
                    sc.nextLine();
                    System.out.print("Enter name: ");
                    String name1 = sc.nextLine();
                    System.out.print("Enter age: ");
                    int age1 = sc.nextInt();
                    System.out.print("Enter gender (MALE/FEMALE/OTHER): ");
                    String g1 = sc.next();
                    Gender gender1 = Gender.valueOf(g1.toUpperCase());
                    st.push(new Person(name1, age1, gender1));
                    break;

                case 2:
                    Person[] temp = new Person[2];
                    for (int i = 0; i < 2; i++) {
                        sc.nextLine();
                        System.out.print("Enter name: ");
                        String n1 = sc.nextLine();
                        System.out.print("Enter age: ");
                        int a1 = sc.nextInt();
                        System.out.print("Enter gender (MALE/FEMALE/OTHER): ");
                        String g2 = sc.next();
                        Gender gen = Gender.valueOf(g2.toUpperCase());
                        temp[i] = new Person(n1, a1, gen);
                    }
                    st.push(temp[0], temp[1]);
                    break;

                case 3:
                    Person popped = st.pop();
                    if (popped != null) popped.displayPerson();
                    break;

                case 4:
                    System.out.print("Enter number of Persons to pop: ");
                    int nPop = sc.nextInt();
                    st.pop(nPop);
                    break;

                case 5:
                    st.display();
                    break;

                case 6:
                    System.out.print("Enter number of top Persons: ");
                    int topN = sc.nextInt();
                    st.display(topN);
                    break;

                case 7:
                    break;
            }
        } while(option != 7);

        sc.close();
    }
}
