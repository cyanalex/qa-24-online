package les2.hw;
//Необходимо, чтоб программа выводила на экран вот такую последовательность:
//7 14 21 28 35 42 49 56 63 70 77 84 91 98.
public class task9
{
    public static void main(String[] args)
    {
        int i=7;
        while (i<99)
        {
            System.out.println(i);
            i+=7;
        }
    }
}
