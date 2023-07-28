package com.example.Music.streaming.service.API.repository

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PutMapping

public interface SongRepository extends MongoRepository<Song, String>{
    Boolean existsSongByFileNameEquals(String filename);
    if(songRepository.existexistsSongByFileNameEquals(file.getOriginalFileName()) || songRepository.existexistsSongByTitleEquals(song.getTitle)){
        return ResponseEntity.badRequest().body(t:"taken");
    }else{
        storageService.uploading(file);

        Song.setFileName(file.getOriginalFileName());
        Song insertedSong=songRepository.insert(song);
        return new ResponseEntity<>(insertedSong, httpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity<song> updatedSong(@PathVariable String id, @RequestBody song songData){
        Optional <song> songOptional=songRepository.findId(id);
        idf(songOptional.isPresent()){
            Song song=songOptional.get();
        }else{
            return ResponseEntity.notFound().build();
    }
    }
}