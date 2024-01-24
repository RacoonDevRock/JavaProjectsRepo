package poo.payment_terminal;

public class Posnet {

    public static final double RECARGO_POR_CUOTA = 0.03;
    public static final int MIN_CANT_CUOTA = 1;
    public static final int MAX_CANT_CUOTA = 6;

    public Ticket efectuar(TarjetaDeCredito tarjetaDeCredito, double montoAPagar, int cantidadCuotas) {
        Ticket elticket = null;

        if (datosValidos(tarjetaDeCredito, montoAPagar, cantidadCuotas)) {
            double montoFinal = montoAPagar + montoAPagar * recargoBaseCuotas(cantidadCuotas);
            if (tarjetaDeCredito.saldoDisponible(montoFinal)) {
                tarjetaDeCredito.descontarSaldo(montoFinal);
                String nomApe = tarjetaDeCredito.nombreTitular();
                double montoPorCuota = montoFinal / cantidadCuotas;
                elticket = new Ticket(nomApe, montoFinal, montoPorCuota);
            }
        }

        return elticket;
    }

    private double recargoBaseCuotas(int cantidadCuotas) {
        return (cantidadCuotas - 1) * RECARGO_POR_CUOTA;
    }

    private boolean datosValidos(TarjetaDeCredito tarjetaDeCredito, double montoAPagar, int cantidadCuotas) {
        boolean esTarjetaValida = tarjetaDeCredito != null;
        boolean esMontoValido = montoAPagar > 0;
        boolean esCuotaValida = cantidadCuotas >= MIN_CANT_CUOTA && cantidadCuotas <= MAX_CANT_CUOTA;

        return esTarjetaValida && esMontoValido && esCuotaValida;
    }
}
