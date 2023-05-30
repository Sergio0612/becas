paquete  sergy ;

public  class  Empleado  extiende  Persona  implementa  Contratable {
    empresa privada de cuerdas  ;
    posición de cadena  privada ;
    Salario de cadena  privado ;

    empleado publico (){}

    public  Empleado ( String  nombre , String  apellido , int  edad , String  empresa , String  cargo , String  salario ){
        super ( nombre , apellido , edad );
        esto _ empresa = empresa ;
        esto _ posición = posición ;
        esto _ salario = salario ;
    }

    contratable público booleano  (){
        devolver  verdadero ;
    }

    cadena  pública getCompany (){
        empresa de devolución ;
    }

    public  void  setCompany ( String  empresa ){
        esto _ empresa = empresa ;
    }

    cadena  pública getPosition (){
        posición de retorno ;
    }

    public  void  setPosition ( Posición de cadena  ){
        esto _ posición = posición ;
    }

    public  String  getSalario (){
        salario de retorno ;
    }

    public  void  setSalario ( String  salario ){
        esto _ salario = salario ;
    }

    Cadena  pública a Cadena (){
        return  "Nombre: " + getNombre () +
                " \n Apellido:" + obtenerApellido ()+
                " \n Edad: " + obtenerEdad () +
                " \n Empresa: " + obtenerEmpresa () +
                " \n Posición: " + obtenerPosición () +
                " \n Salario: " + obtenerSalario () +
                " \n Contratable: " + ( contratable () ? "Si" : "No" );
    }
}