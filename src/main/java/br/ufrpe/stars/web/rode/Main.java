package br.ufrpe.stars.web.rode;

import com.aparapi.device.Device;
import br.ufrpe.stars.web.rode.rbd.geradorScript.GeradorScript;
import br.ufrpe.stars.web.rode.rbd.modelo.RBD;
import br.ufrpe.stars.web.rode.rbd.modelo.composicao.JustRBD;
import br.ufrpe.stars.web.rode.rbd.modelo.composicao.ParaleloRBD;
import br.ufrpe.stars.web.rode.rbd.modelo.composicao.SerieRBD;
import br.ufrpe.stars.web.rode.spn.LugarSPN;
import br.ufrpe.stars.web.rode.spn.SPN;
import br.ufrpe.stars.web.rode.spn.Transicao;
import br.ufrpe.stars.web.rode.spn.TransicaoExponencial;
import br.ufrpe.stars.web.rode.spn.trem.Estacao;
import br.ufrpe.stars.web.rode.spn.trem.SistemaFerroviario;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        var device = Device.firstGPU();
        System.out.println(device);
        /*Locale.setDefault(Locale.US);
        var txt = IntStream.range(0,10)
                .mapToObj(i -> "P"+i)
                .map("(E{#%1$s})"::formatted)
                .collect(Collectors.joining("+"));
        System.out.println(txt);*/
    }
}
