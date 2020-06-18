using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AsyncTest
{
    public class Functions
    {

        public async Task<string> MakeTaskAsync()
        {

            try
            {

                Console.WriteLine("C# rules!");
                for (int i = 0; i < 100; i++)
                {
                    Console.WriteLine(i);
                }
            }
            catch (Exception ex)
            {

            }

            return await Task.FromResult("MakeTask -> Async");
        }
    }
}
