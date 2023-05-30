paquete  sergy ;

        clase  pública EstudianteTrabajador  extiende  Persona  implementa  Becable , Contratable {
        universidad privada de cuerdas  ;
        carrera privada de cuerdas  ;
        cadena  privada año ;
        empresa privada de cuerdas  ;
        posición de cadena  privada ;
        Salario de cadena  privado ;

public  EstudianteTrabajador (){}

public  EstudianteTrabajador ( String  nombre , String  apellido , edad int  , String universidad , String carrera , String año , String empresa , String cargo , String salario ){
        super ( nombre , apellido , edad );
        esto _ universidad = universidad ;
        esto _ carrera = carrera ;
        esto _ año = año ;
        esto _ empresa = empresa ;
        esto _ posición = posición ;
        esto _ salario = salario ;
        }

        cable booleano  público (){
        devolver  verdadero ;
        }

        contratable público booleano  (){
        devolver  verdadero ;
        }

public  String  getUniversidad () {
        regreso  universidad ;
        }

public  void  setUniversidad ( String  universidad ) {
        esto _ universidad = universidad ;
        }

public  String  getCarrera () {
        carrera de regreso ;
        }

public  void  setCareer ( String  carrera ) {
        esto _ carrera = carrera ;
        }

public  String  obtenerAño () {
        año de retorno ;
        }

public  void  setYear ( String  año ) {
        esto _ año = año ;
        }

        cadena  pública getCompany () {
        empresa de devolución ;
        }

public  void  setCompany ( String  empresa ) {
        esto _ empresa = empresa ;
        }

        cadena  pública getPosition () {
        posición de retorno ;
        }

public  void  setPosition ( Posición de cadena  ) {
        esto _ posición = posición ;
        }

public  String  obtener Salario () {
        salario de retorno ;
        }

public  void  setSalario ( String  salario ) {
        esto _ salario = salario ;
        }

        cadena  pública a la cadena () {
        return  "Nombre: " + getNombre () +
        " \n Apellido:" + obtenerApellido ()+
        " \n Edad: " + obtenerEdad () +
        " \n Universidad: " + obtenerUniversidad () +
        " \n Carrera: " + obtenerCarrera () +
        " \n Año: " + obtenerAño () +
        " \n Empresa: " + obtenerEmpresa () +
        " \n Posición: " + obtenerPosición () +
        " \n Salario: " + obtenerSalario () +
        " \n Becable: " + ( becable () ? "Si" : "No" ) +
        " \n Contratable: " + ( contratable () ? "Si" : "No" );
        }
        }