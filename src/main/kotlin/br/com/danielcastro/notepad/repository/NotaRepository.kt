package br.com.danielcastro.notepad.repository

import br.com.danielcastro.notepad.model.Nota
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface  NotaRepository : MongoRepository<Nota, String> {


    fun findByTitulo(titulo: String): Nota

}