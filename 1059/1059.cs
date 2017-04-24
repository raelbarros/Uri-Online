using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _1059_Numeros_pares
{
    class Program
    {
        static void Main(string[] args)
        {
            int x = 0;

            while (x < 100) {
                x += 2;
                Console.WriteLine(x);
            }

            Console.ReadKey();

        }
    }
}
