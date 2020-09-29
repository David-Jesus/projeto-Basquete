package Desafio_Publica;

import java.util.ArrayList;
import java.util.Collections;

public class Temporada {
	public ArrayList<Integer> jogo = new ArrayList<>();
	public ArrayList<Integer> placar = new ArrayList<>();
	private ArrayList<Integer> minTemporada = new ArrayList<>();
	private ArrayList<Integer> maxTemporada = new ArrayList<>();
	private ArrayList<Integer> recordeMinimo = new ArrayList<>();
	private ArrayList<Integer> recordeMaximo = new ArrayList<>();

	public Temporada() {
		this.jogosIniciais();
		this.placaresIniciais();
		this.minimosIniciais();
		this.maximosIniciais();
		this.recordesMinIniciais();
		this.recordeMaxIniciais();
	}

	// Métodos para Inicializar com os valores já definidos
	private void jogosIniciais() {
		for (int i = 0; i < 4; i++) {
			this.jogo.add(i + 1);
		}
	}

	private void placaresIniciais() {
		this.placar.add(12);
		this.placar.add(24);
		this.placar.add(10);
		this.placar.add(24);

	}

	private void minimosIniciais() {
		this.minTemporada.add(12);
		this.minTemporada.add(12);
		this.minTemporada.add(10);
		this.minTemporada.add(10);
	}

	private void maximosIniciais() {
		this.maxTemporada.add(12);
		this.maxTemporada.add(24);
		this.maxTemporada.add(24);
		this.maxTemporada.add(24);
	}

	private void recordesMinIniciais() {
		this.recordeMinimo.add(0);
		this.recordeMinimo.add(0);
		this.recordeMinimo.add(1);
		this.recordeMinimo.add(1);
	}

	private void recordeMaxIniciais() {
		this.recordeMaximo.add(0);
		this.recordeMaximo.add(1);
		this.recordeMaximo.add(1);
		this.recordeMaximo.add(1);

	}

	public void NovoJogo() {
		this.jogo.add(jogo.size() + 1);

	}

	public ArrayList<Integer> getJogo() {
		return this.jogo;
	}

	public void setPlacar(int p) {
		this.placar.add(p);
		novoMinimo();
		novoMaximo();
	}

	public ArrayList<Integer> getPlacar() {
		return this.placar;
	}

	public void novoMinimo() {
		int novoPlacar = placar.get(placar.size() - 1);
		boolean adicionou = false;
		for (int i = 0; i < (minTemporada.size() - 1); i++) {
			if (novoPlacar < Collections.min(this.minTemporada)) {
				this.minTemporada.add(novoPlacar);
				adicionou = true;
				this.recordeMinimo.add(Collections.max(this.recordeMinimo) + 1);
			}
		}
		if (adicionou == false) {
			this.minTemporada.add(Collections.min(this.minTemporada));
			this.recordeMinimo.add(Collections.max(this.recordeMinimo));
		}

	}

	public void novoMaximo() {
		int novoPlacar = placar.get(placar.size() - 1);
		boolean adicionou = false;
		for (int i = 0; i < (maxTemporada.size() - 1); i++) {
			if (novoPlacar > Collections.max(this.maxTemporada)) {
				this.maxTemporada.add(novoPlacar);
				this.recordeMaximo.add(Collections.max(recordeMaximo) + 1);
				adicionou = true;
			}
		}
		if (adicionou == false) {
			this.maxTemporada.add(Collections.max(maxTemporada));
			this.recordeMaximo.add(Collections.max(recordeMaximo));
		}
	}

	public int getRecordesMinimos() {
		return this.recordeMinimo.get(this.recordeMinimo.size() - 1);
	}

	public int getRecordesMaximos() {
		return this.recordeMaximo.get(this.recordeMaximo.size() - 1);
	}

	public void statusTabela() {
		System.out.printf("%1s%10s%15s%15s%15s%15s\n", "Jogo |", "Placar |", " Min.Temporada |", " Max.Temporada |",
				" Recorde.minímo |", " Recorde.máximo |");
		for (int i = 0; i < jogo.size(); i++) {
			System.out.printf("%-2s", "");
			System.out.printf("%-8d", jogo.get(i));
			System.out.printf("%-12d", placar.get(i));
			System.out.printf("%-16d", minTemporada.get(i));
			System.out.printf("%-17d", maxTemporada.get(i));
			System.out.printf("%-17d", recordeMinimo.get(i));
			System.out.printf("%-10d", recordeMaximo.get(i));
			System.out.println("\n");
		}

	}

}
