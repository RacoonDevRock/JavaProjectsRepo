package com.springboot.data.jpa.paginator;

import lombok.Getter;
import org.springframework.data.domain.Page;

import java.util.ArrayList;
import java.util.List;

public class PageRender<T> {

    @Getter
    private String url;
    private Page<T> page;

    @Getter
    private int totalPaginas;
    private int numElementosPorPagina;

    @Getter
    private int paginaActual;

    @Getter
    private List<PageItem> paginas;

    public PageRender(String url, Page<T> page) {
        this.url = url;
        this.page = page;
        this.paginas = new ArrayList<PageItem>();

        numElementosPorPagina = page.getSize();
        totalPaginas = page.getTotalPages();
        paginaActual = page.getNumber() + 1;

        int init, stop;
        if (totalPaginas <= numElementosPorPagina) {
            init = 1;
            stop = totalPaginas;
        } else {
            if (paginaActual <= numElementosPorPagina / 2) {
                init = 1;
                stop = numElementosPorPagina;
            } else if (paginaActual >= totalPaginas - numElementosPorPagina / 2) {
                init = totalPaginas - numElementosPorPagina + 1;
                stop = numElementosPorPagina;
            } else {
                init = paginaActual - numElementosPorPagina / 2;
                stop = numElementosPorPagina;
            }
        }

        for (int i = 0; i < stop; i++) {
            paginas.add(new PageItem(init + i, paginaActual == init + i));
        }
    }

    public boolean isFirst() {
        return page.isFirst();
    }

    public boolean isLast() {
        return page.isLast();
    }

    public boolean isHasNext() {
        return page.hasNext();
    }

    public boolean isHasPrevious() {
        return page.hasPrevious();
    }
}
