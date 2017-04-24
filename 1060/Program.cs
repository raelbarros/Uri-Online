using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _1060_Numeros_positivos
{
    class Program
    {
        static void Main(string[] args)
        {

            double[] vet = new double[6];
            int aux=0;

            for (int i = 0; i < 6; i++) {
                vet[i] = double.Parse(Console.ReadLine());
             
            }

            for (int i = 0; i < 6; i++) {
                if (vet[i] >= 0) 
                    aux++;
            }

                Console.WriteLine(aux + " valores positivos");



            Console.ReadKey();
        }
    }
}
