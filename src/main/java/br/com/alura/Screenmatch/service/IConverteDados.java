package br.com.alura.Screenmatch.service;

public interface IConverteDados {
    <T> T obeterDados (String json, Class <T> classe);
}
