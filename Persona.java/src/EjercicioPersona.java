public class EjercicioPersona {

    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setEdad(29);
        persona.setNombre("Franco");
        persona.setTel(11323255);

        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Teléfono: " + persona.getTel());
    }


    public static class Persona {
        private int edad;
        private String nombre;
        private int tel;

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getTel() {
            return tel;
        }

        public void setTel(int tel) {
            this.tel = tel;
        }
    }
}