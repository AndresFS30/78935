using System;
using WDSL.mensajes;

namespace WDSL.operaciones
{
    public class Operaciones : Mensajes
    {
        public string Saludar(string nombre)
        {
            string msj = "Hola "+nombre", te saluda Andres";
            return msj;
        }
        public string Mostrar(int id)
        {
            return "x";
        }
    }
}
