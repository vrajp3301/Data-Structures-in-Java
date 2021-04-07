import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Stack
{

    private int top;
    private int item[];

    Stack(int size)
    {
        top = -1;
        item = new int[size];
    }

    void pushItem(int data)
    {
        if (top == item.length - 1)
        {
            System.out.println("Stack is Full");
        }
        else
        {
            item[++top] = data;
            System.out.println("Pushed Item :" + item[top]);
        }
    }

    int popItem()
    {
        if (top < 0)
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        else
        {
            System.out.println("Pop Item : " + item[top]);
            return item[top--];
        }
    }
    void displayAll()
    {
        for (int i = 0; item[i] != 0; i++)
        {
            System.out.print(item[i] + "\t");
        }

        System.out.println("");
    }
}

class StackArray
{

    public static void main(String[] args) throws IOException
    {
        Stack stk = new Stack(5);
        boolean yes = true;
        int choice;
        BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("1).Push\n2).Pop\n3).Display\n4).Exit\n");
        do
        {
            System.out.print("\nEnter Choice : ");

            choice = Integer.parseInt(is.readLine());

            switch (choice)
            {
                case 1:
                    System.out.print("Enter Push Item :");
                    stk.pushItem(Integer.parseInt(is.readLine()));
                    break;
                case 2:
                    stk.popItem();
                    break;
                case 3:
                    stk.displayAll();
                    break;
                case 4:
                    yes = false;
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        }
        while (yes == true);

    }
}