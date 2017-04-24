using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace URI_1066
{
    class Program
    {
        static void Main(string[] args)
        {
            int x, aux = 1;

            x = int.Parse(Console.ReadLine());

            while (aux <= x) 
            {
                if (aux % 2 != 0)
                {
                    Console.WriteLine(aux);
                }
                aux++;
            }


            Console.ReadKey();
        }
    }
}
