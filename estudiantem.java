paquete  sergy ;

        clase  pública Estudiante  extiende  Persona  implementa  Becable {
        universidad privada de cuerdas  ;
        carrera privada de cuerdas  ;
        cadena  privada año ;

        Público  Estudiante (){}

public  Estudiante ( String  nombre , String  apellido , int  edad , String  universidad , String  carrera , String  año ){
        super ( nombre , apellido , edad );
        esto _ universidad = universidad ;
        esto _ carrera = carrera ;
        esto _ año = año ;
        }

        cable booleano  público (){
        devolver  verdadero ;
        }

public  String  getUniversidad (){
        regreso  universidad ;
        }

public  void  setUniversidad ( String  universidad ){
        esto _ universidad = universidad ;
        }

public  String  getCarrera (){
        carrera de regreso ;
        }

public  void  setCareer ( String  carrera ){
        esto _ carrera = carrera ;
        }

        Cadena  pública getYear (){
        año de retorno ;
        }

public  void  setYear ( String  año ){
        esto _ año = año ;
        }

        Cadena  pública a Cadena (){
        return  "Nombre: " + getNombre () +
        " \n Apellido:" + obtenerApellido ()+
        " \n Edad: " + obtenerEdad () +
        " \n Universidad: " + obtenerUniversidad () +
        " \n Carrera: " + obtenerCarrera () +
        " \n Año: " + obtenerAño () +
        " \n Becable: " + ( becable () ? "Si" : "No" );
        }
        }