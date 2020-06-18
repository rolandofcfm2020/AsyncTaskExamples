using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AsyncTest
{
    class Program
    {
        static void Main(string[] args)
        {
            Functions func = new Functions();
            string stringTask;

            Task.Run(async () => {

                stringTask = await func.MakeTaskAsync();
                Console.WriteLine(stringTask);

            }).ContinueWith(cont => { Console.WriteLine("Por fin terminé"); });

            Console.WriteLine("Ejecutando tarea principal");

            Console.ReadLine();
        }
    }
}
