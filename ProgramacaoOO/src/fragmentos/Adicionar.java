package fragmentos;

import java.util.ArrayList;
import java.util.List;

public class Adicionar {
	
	public static List<Personagem> adicionar(){
		
		List<Personagem> lista = new ArrayList<Personagem>();
		
		Personagem gangplank = new Personagem("Gangplank", true, 3150);
		Personagem katarina = new Personagem("Katarina", true, 3150);
		Personagem shaco = new Personagem("Shaco", true, 3150);
		Personagem aphelios = new Personagem("Aphelios", true, 4800);
		Personagem elise = new Personagem("Elise", true, 4800);
		Personagem khazix = new Personagem("Kha'Zix", true, 4800);
		Personagem qiyana = new Personagem("Qiyana", true, 4800);
		Personagem rengar = new Personagem("Rengar", true, 4800);

		Personagem heimerdinger = new Personagem("Heimerdinger", false, 3150);
		Personagem jhin = new Personagem("Jhin", false, 4444);
		Personagem bardo = new Personagem("Bardo", false, 4800);
		Personagem gnar = new Personagem("Gnar", false, 4800);
		Personagem ivern = new Personagem("Ivern", false, 4800);
		Personagem neeko = new Personagem("Neeko", false, 4800);
		Personagem reksai = new Personagem("Rek'Sai", false, 4800);
		Personagem rell = new Personagem("Rell", false, 4800);
		Personagem renekton = new Personagem("Renekton", false, 4800);
		Personagem viktor = new Personagem("Viktor", false, 4800);
		Personagem ambessa = new Personagem("Ambessa", false, 6300);
		Personagem aurora = new Personagem("Aurora", false, 6300);
		
		lista.add(gangplank);
		lista.add(katarina);
		lista.add(shaco);
		lista.add(aphelios);
		lista.add(elise);
		lista.add(khazix);
		lista.add(qiyana);
		lista.add(rengar);
		lista.add(heimerdinger);
		lista.add(jhin);
		lista.add(bardo);
		lista.add(gnar);
		lista.add(ivern);
		lista.add(neeko);
		lista.add(reksai);
		lista.add(rell);
		lista.add(renekton);
		lista.add(viktor);
		lista.add(ambessa);
		lista.add(aurora);
		
		for(Personagem personagem : lista) {
			if(personagem.estado) {
				personagem.valor = personagem.valor * 60/100;
			}
		}
		
		return lista;
	}
	
}
