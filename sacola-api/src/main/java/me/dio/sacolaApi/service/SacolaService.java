package me.dio.sacolaApi.service;

import me.dio.sacolaApi.model.Item;
import me.dio.sacolaApi.model.Sacola;
import me.dio.sacolaApi.resource.dto.ItemDto;

public interface SacolaService {
    Item incluirItemNaSacola(ItemDto itemDto);
    Sacola verSacola(Long id);
    Sacola fecharSacola(Long id, int formaPagamento);
}
