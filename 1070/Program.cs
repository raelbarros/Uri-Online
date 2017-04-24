using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace URI_1070
{
    class Program
    {
        static void Main(string[] args)
        {

            int x;
            int aux = 0;

            x = int.Parse(Console.ReadLine());

            while(aux < 6)
            {
                if (x % 2 != 0)
                {
                    Console.WriteLine(x);
                    aux++;
                }               
                x++;    
            }

            Console.ReadKey();
        }
    }
}
