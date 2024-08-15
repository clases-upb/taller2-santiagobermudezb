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
    
        } 
        
        catch (Exception e) {
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

     public static int Calcular_saldo(int base, int totalRecaudos, int totalRetiros) {
        final int BASE_VALIDA = 2000000;
        
        try {
            if (base != BASE_VALIDA) {
                return -1;
            }
    
            return base + totalRecaudos - totalRetiros;
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
     * 
     */

     public static String Calcular_tip(float consumo) {
        try {
            if (consumo <= 0) {
                return "Error calculando consumo";
            }
    
            float propina = consumo * 0.10f;
            float impuestoConsumo = consumo * 0.08f;
            float totalPagar = consumo + propina + impuestoConsumo;
    
            return String.format("valor comida: $%.2f - valor propina $%.2f - valor impoconsumo $%.2f - total a pagar $%.2f",
                    consumo, propina, impuestoConsumo, totalPagar);
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
     * 
     */

     public static int Obtener_puntos(int ganados, int perdidos, int empatados) {
        try {
            if (ganados < 0 || perdidos < 0 || empatados < 0) {
                return -1;
            }
    
            return ganados * 3 + empatados * 1;
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

     public static float Calcular_definitiva(float[] notas, float[] porcentajes) {
        try {
            if (notas.length != 5 || porcentajes.length != 5) {
                return -1;
            }
    
            float sumaPorcentajes = 0;
            for (float p : porcentajes) {
                if (p < 0 || p > 1) {
                    return -1;
                }
                sumaPorcentajes += p;
            }
    
            if (sumaPorcentajes != 1) {
                return -1;
            }
    
            float definitiva = 0;
            for (int i = 0; i < 5; i++) {
                if (notas[i] < 0 || notas[i] > 5) {
                    return -1;
                }
                definitiva += notas[i] * porcentajes[i];
            }
    
            return definitiva;
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

     public static float Calcular_para_ganar(float[] porcentajes, float[] notas) {
        try {
            if (porcentajes.length != 5 || notas.length != 4) {
                return -1;
            }
    
            float sumaPorcentajes = 0;
            for (float p : porcentajes) {
                if (p < 0 || p > 1) {
                    return -1;
                }
                sumaPorcentajes += p;
            }
    
            if (sumaPorcentajes != 1) {
                return -1;
            }
    
            float notaAcumulada = 0;
            for (int i = 0; i < 4; i++) {
                if (notas[i] < 0 || notas[i] > 5) {
                    return -1;
                }
                notaAcumulada += notas[i] * porcentajes[i];
            }
    
            float notaParaGanar = (3 - notaAcumulada) / porcentajes[4];
            return notaParaGanar;
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

    public static float Calcular_salario(int horasNormales, int horasExtrasDiurnas, int horasExtrasNocturnas, float valorHoraNormal) {
        try {
            if (valorHoraNormal <= 0) {
                return -1;
            }
    
            float salario = horasNormales * valorHoraNormal;
            salario += horasExtrasDiurnas * valorHoraNormal * 1.15f;
            salario += horasExtrasNocturnas * valorHoraNormal * 1.35f;
    
            return salario;
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
        try {
            if (base <= 0 || altura <= 0) {
                return -1;
            }
    
            return 0.5f * base * altura;
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
        try {
            if (lado <= 0) {
                return -1;
            }
    
            return lado * 4;
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

     public static float Calcular_volumen_cilindro(float radio, float altura) {
        final float PI = 3.1415927f;
        
        try {
            if (radio <= 0 || altura <= 0) {
                return -1;
            }
    
            return PI * radio * radio * altura;
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

     public static float Calcular_area_circulo(float radio) {
        final float PI = 3.1415927f;
        
        try {
            if (radio <= 0) {
                return -1;
            }
    
            return PI * radio * radio;
        } catch (Exception e) {
            return -1;
        }
    }
    
}
