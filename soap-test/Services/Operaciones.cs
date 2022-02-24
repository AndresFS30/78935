using System;
using WDSL.mensajes;

namespace WDSL.operaciones
{
    public class Operaciones : Mensajes
    {
        public string Saludar(string nombre)
        {
            string msj = "Hola "+nombre", tesaluda Andres";
            return msj;
        }
        public string Mostrar(int id)
        {
            return "x";
        }
    }
}
