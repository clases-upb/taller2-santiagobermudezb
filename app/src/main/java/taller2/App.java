/*
 * Este es el segundo taller de lógica de programación. En este taller deben comenzar a prácticar hacer las validaciones
 * de los datos que va a recibir la función usando los condicionales if. 
 * 
 * Como en el anterior, tenga en cuenta la siguiente rúbrica para cada ejercicio la cual, 
 * se basa en los mandamientos del programador. El taller es una herramienta para comenzar a preparar la evaluación 
 * donde los descuentos si van a ser tenidos en cuenta. 
 * Con este taller, usted irá aprendiendo a aplicar buenas prácticas en la programación.
 * 
 * La siguiente rúbrica se descuenta en cada ejercicio y es acumulativa:
 * Descuento por quemar valores en el código y no usar constantes: -0.5
 * Descuento por no implementar control de errores con trycatch: -0.8
 * Descuento por no escribir el código ordenado, identado: -0.4
 * 
 * RÉTESE, PÓNGASE A PRUEBA!!!
 * 
 */
package taller2;

public class App {

    public static void main(String[] args) {
        try {
            // Puedes agregar aquí la lógica de prueba para tus funciones
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /*
     * 1. Diseñe un algoritmo e implemente la función Calcular_saldo que reciba
     * tres enteros: la base de dinero en la taquilla, el total de recaudos y
     * el total de retiros, y retorne un entero que represente el saldo final
     * en la taquilla.
     * 
     * Valide que la base sea igual a 2.000.000. Si no es así, retorne -1.
     * 
     * saldo_taquilla = base + total recaudos - total_retiros
     * Si hay algún error, retorne -1.
     */
    public static int Calcular_saldo(int base_taquilla, int total_recaudos, int total_retiros) {
        final int BASE_TAQUILLA_CORRECTA = 2000000;
        try {
            if (base_taquilla == BASE_TAQUILLA_CORRECTA) {
                return base_taquilla + total_recaudos - total_retiros;
            } else {
                return -1;
            }
        } catch (Exception e) {
            return -1;
        }
    }

    /*
     * 2. Diseñe un algoritmo e implemente la función Calcular_tip que reciba
     * un float representando el valor del consumo de un cliente, y devuelva
     * un string que contenga el valor de la propina (10%), el impuesto al
     * consumo (8%) y el valor total a pagar.
     * 
     * MUY IMPORTANTE:
     * 
     * El formato del string debe ser: valor comida: $### - valor propina $### -
     * valor impoconsumo $### - total a pagar $###.
     * 
     * Si hay algún error, retorne "Error en la función Calcular_tip".
     * 
     * Ademas de esto, primero valide que el valor del consumo sea mayor a 0. Si no
     * es así, retorne "Error calculando consumo".
     */
    public static String Calcular_tip(float consumo_cliente) {
        final float PROPORCION_PROPINA = 0.1f;
        final float PROPORCION_IMPUESTO = 0.08f;

        try {
            if (consumo_cliente <= 0) {
                return "Error calculando consumo";
            } else {
                float valor_propina = consumo_cliente * PROPORCION_PROPINA;
                float valor_imp_consumo = consumo_cliente * PROPORCION_IMPUESTO;
                float total = consumo_cliente + valor_propina + valor_imp_consumo;

                return String.format("valor comida: $%.2f - valor propina $%.2f - valor impoconsumo $%.2f - total a pagar $%.2f",
                        consumo_cliente, valor_propina, valor_imp_consumo, total);
            }
        } catch (Exception e) {
            return "Error en la función Calcular_tip";
        }
    }

    /*
     * 3. Diseñe un algoritmo e implemente la función Obtener_puntos que reciba
     * tres enteros representando el número de partidos ganados, perdidos y
     * empatados de un equipo de fútbol, y devuelva un entero que represente
     * los puntos totales del equipo. La puntuación sigue los lineamientos
     * de la FIFA: 3 puntos por partido ganado, 1 punto por partido empatado y
     * 0 puntos por partido perdido. Si hay algún error, retorne -1.
     * 
     * Valide ademas que los partidos ganados, perdidos y empatados sean mayores o
     * iguales a 0. Si no es así, retorne -1.
     */
    public static int Obtener_puntos(int partidos_W, int partidos_L, int partidos_E) {
        final byte PUNTOS_POR_VICTORIA = 3;
        final byte PUNTOS_POR_EMPATE = 1;

        try {
            if (partidos_W >= 0 && partidos_L >= 0 && partidos_E >= 0) {
                return partidos_W * PUNTOS_POR_VICTORIA + partidos_E * PUNTOS_POR_EMPATE;
            } else {
                return -1;
            }
        } catch (Exception e) {
            return -1;
        }
    }

    /*
     * 4. Diseñe un algoritmo e implemente la función Calcular_definitiva que
     * reciba cinco floats representando las notas (entre 0 y 5) y cinco floats
     * representando los porcentajes (que entre todos deberán sumar 1 y cada uno
     * estar entre 0 y 1),
     * y devuelva un float que represente la nota definitiva. Si algo está mal
     * con los porcentajes o con las notas, retorne -1.
     */
    public static float Calcular_definitiva(float nota1, float nota2, float nota3, float nota4, float nota5,
                                            float porcentaje1, float porcentaje2, float porcentaje3,
                                            float porcentaje4, float porcentaje5) {
        try {
            float suma_porcentajes = porcentaje1 + porcentaje2 + porcentaje3 + porcentaje4 + porcentaje5;

            if (suma_porcentajes == 1 &&
                porcentaje1 >= 0 && porcentaje1 <= 1 &&
                porcentaje2 >= 0 && porcentaje2 <= 1 &&
                porcentaje3 >= 0 && porcentaje3 <= 1 &&
                porcentaje4 >= 0 && porcentaje4 <= 1 &&
                porcentaje5 >= 0 && porcentaje5 <= 1 &&
                nota1 >= 0 && nota1 <= 5 &&
                nota2 >= 0 && nota2 <= 5 &&
                nota3 >= 0 && nota3 <= 5 &&
                nota4 >= 0 && nota4 <= 5 &&
                nota5 >= 0 && nota5 <= 5) {

                return nota1 * porcentaje1 + nota2 * porcentaje2 + nota3 * porcentaje3 +
                       nota4 * porcentaje4 + nota5 * porcentaje5;
            } else {
                return -1;
            }
        } catch (Exception e) {
            return -1;
        }
    }

    /*
     * 5. Diseñe un algoritmo e implemente la función Calcular_para_ganar que
     * reciba cinco floats representando los porcentajes de una materia (que
     * deberán sumar 1 y estar entre 0 y 1) y cuatro floats representando las
     * primeras notas (entre 0 y 5), y devuelva un float que represente la
     * nota que deberá sacar para ganar si el puntaje mínimo es 3. Si algo
     * está mal con los porcentajes o con las notas, retorne -1.
     */
    public static float Calcular_para_ganar(float nota1, float nota2, float nota3, float nota4,
                                             float porcentaje1, float porcentaje2, float porcentaje3,
                                             float porcentaje4, float porcentaje5) {
        final float PUNTAJE_MINIMO = 3.0f;
        try {
            float suma_porcentajes = porcentaje1 + porcentaje2 + porcentaje3 + porcentaje4 + porcentaje5;

            if (suma_porcentajes == 1 &&
                porcentaje1 >= 0 && porcentaje1 <= 1 &&
                porcentaje2 >= 0 && porcentaje2 <= 1 &&
                porcentaje3 >= 0 && porcentaje3 <= 1 &&
                porcentaje4 >= 0 && porcentaje4 <= 1 &&
                porcentaje5 >= 0 && porcentaje5 <= 1 &&
                nota1 >= 0 && nota1 <= 5 &&
                nota2 >= 0 && nota2 <= 5 &&
                nota3 >= 0 && nota3 <= 5 &&
                nota4 >= 0 && nota4 <= 5) {

                float nota_actual = nota1 * porcentaje1 + nota2 * porcentaje2 + nota3 * porcentaje3 + nota4 * porcentaje4;
                float nota_faltante = PUNTAJE_MINIMO - nota_actual;
                return Math.round(nota_faltante / porcentaje5);
            } else {
                return -1;
            }
        } catch (Exception e) {
            return -1;
        }
    }

    /*
     * 6. Diseñe un algoritmo e implemente la función Calcular_salario que
     * reciba cuatro enteros: cantidad de horas normales laboradas, cantidad
     * de horas extras diurnas laboradas, cantidad de horas extras nocturnas
     * laboradas, y el valor de la hora normal como un float. La función debe
     * retornar un float con el salario total. Las horas extras diurnas tienen
     * un recargo adicional del 15% sobre la hora normal, y las horas extras
     * nocturnas tienen un recargo adicional del 35% sobre la hora normal.
     * 
     * Valide que el valor de la hora normal sea mayor a 0. Si no es así, retorne
     * -1.
     * 
     * Si hay algún error, retorne -1.
     */
    public static float Calcular_salario(int horas_normales, int horas_extra_diurnas, int horas_extra_nocturnas, float valor_hora) {
        final float RECARGO_EXTRA_DIURNO = 0.15f;
        final float RECARGO_EXTRA_NOCTURNO = 0.35f;

        try {
            if (valor_hora > 0) {
                float salario_total = valor_hora * horas_normales +
                                      valor_hora * horas_extra_diurnas * (1 + RECARGO_EXTRA_DIURNO) +
                                      valor_hora * horas_extra_nocturnas * (1 + RECARGO_EXTRA_NOCTURNO);
                return salario_total;
            } else {
                return -1;
            }
        } catch (Exception e) {
            return -1;
        }
    }

    /*
     * 7. Diseñe un algoritmo e implemente la función Calcular_area_triangulo
     * que reciba dos floats representando la base y la altura de un triángulo
     * rectángulo, y devuelva un float que represente el área del triángulo.
     * 
     * Valide que la base y la altura sean mayores a 0. Si no es así, retorne -1.
     * 
     * La fórmula del área es: área = 1/2 * base * altura.
     * 
     * Si hay algún error, retorne -1.
     */
    public static float Calcular_area_triangulo(float base, float altura) {
        final float FACTOR_AREA = 0.5f;

        try {
            if (base > 0 && altura > 0) {
                return FACTOR_AREA * base * altura;
            } else {
                return -1;
            }
        } catch (Exception e) {
            return -1;
        }
    }

    /*
     * 8. Diseñe un algoritmo e implemente la función Calcular_perimetro_cuadrado
     * que reciba un float representando el lado de un cuadrado, y devuelva un
     * float que represente el perímetro del cuadrado.
     * 
     * Valide que el lado sea mayor a 0. Si no es así, retorne -1.
     * 
     * La fórmula del perímetro es: perímetro = lado * 4.
     * 
     * Si hay algún error, retorne -1.
     */
    public static float Calcular_perimetro_cuadrado(float lado) {
        final int FACTOR_PERIMETRO = 4;

        try {
            if (lado > 0) {
                return lado * FACTOR_PERIMETRO;
            } else {
                return -1;
            }
        } catch (Exception e) {
            return -1;
        }
    }

    /*
     * 9. Diseñe un algoritmo e implemente la función Calcular_volumen_cilindro
     * que reciba dos floats representando el radio de la base y la altura de
     * un cilindro, y devuelva un float que represente el volumen del cilindro.
     * 
     * Valide que el radio y la altura sean mayores a 0. Si no es así, retorne -1.
     * 
     * La fórmula del volumen es: V = pi * radio^2 * altura, usando pi con
     * precisión de 7 decimales (3.1415927).
     * 
     * Si hay algún error, retorne -1.
     */
    public static float Calcular_volumen_cilindro(float radio_base, float altura_cilindro) {
        final float PI = 3.1415927f;

        try {
            if (radio_base > 0 && altura_cilindro > 0) {
                return PI * radio_base * radio_base * altura_cilindro;
            } else {
                return -1;
            }
        } catch (Exception e) {
            return -1;
        }
    }

    /*
     * 10. Diseñe un algoritmo e implemente la función Calcular_area_circulo
     * que reciba un float representando el radio de un círculo, y devuelva un
     * float que represente el área del círculo.
     * 
     * Valide que el radio sea mayor a 0. Si no es así, retorne -1.
     * 
     * La fórmula del área es: área = pi * radio^2, usando pi con precisión
     * de 7 decimales (3.1415927).
     * 
     * Si hay algún error, retorne -1.
     */
    public static float Calcular_area_circulo(float radio_circulo) {
        final float PI = 3.1415927f;

        try {
            if (radio_circulo > 0) {
                return PI * radio_circulo * radio_circulo;
            } else {
                return -1;
            }
        } catch (Exception e) {
            return -1;
        }
    }
}

