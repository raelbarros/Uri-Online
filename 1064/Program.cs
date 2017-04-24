using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace URI_1064
{
    class Program
    {
        static void Main(string[] args)
        {

            double[] vet = new double[6];
            int aux = 0;
            double media = 0;

            for (int i = 0; i < 6; i++)
            {
                vet[i] = double.Parse(Console.ReadLine());

            }

            for (int i = 0; i < 6; i++)
            {
                if (vet[i] >= 0)
                {
                    media += vet[i];
                    aux++;
                }
            }

            media = media / aux;

            Console.WriteLine(aux + " valores positivos");
            Console.WriteLine(Math.Round(media,1));


            Console.ReadKey();
        }
    }
}
