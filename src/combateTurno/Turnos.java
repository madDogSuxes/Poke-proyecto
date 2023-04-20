package combateTurno;

public class Turnos extends Combate {

	protected int idTurno;
	protected int numeroDeTurnos;
	protected int numeroDeTurnosRival;
	protected int turnosEntrenador;

	public Turnos() {
		this.idTurno = 0;
		this.numeroDeTurnos = 0;
		this.numeroDeTurnosRival = 0;
		this.turnosEntrenador = 0;
	}

	public Turnos(int idTurno, int numeroDeTurnos, int numeroDeTurnosRival, int turnosEntrenador) {
		this.idTurno = 0;
		this.numeroDeTurnos = 0;
		this.numeroDeTurnosRival = 0;
		this.turnosEntrenador = 0;
	}

	public Turnos(Turnos c) {
		this.idTurno = c.idTurno;
		this.numeroDeTurnos = c.numeroDeTurnos;
		this.numeroDeTurnosRival = c.numeroDeTurnosRival;
		this.turnosEntrenador = c.turnosEntrenador;
	}

	public int guardadoDeTurnos() {
		int turnosGuardados = 0;
		return turnosGuardados;
		}
}
