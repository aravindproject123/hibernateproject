package dto;

import java.io.Serializable;

import javax.persistence.*;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "Game_Detail")
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class GameDto implements Serializable
{
	@Id
	@GenericGenerator(name = "id_genrator",strategy ="increment" )
	@GeneratedValue(generator = "id_genrator")
	@Column(name = "Id")
	private Integer id;
	
	@Column(name="Name")
	private String name;
	
	@Column(name = "Genre")
	private String genre;
	
	@Column(name = "ReleasedDate")
	private Integer releaseDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Integer getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Integer releaseDate) {
		this.releaseDate = releaseDate;
	}

	@Override
	public String toString() {
		return "GameDto [id=" + id + ", name=" + name + ", genre=" + genre + ", releaseDate=" + releaseDate + "]";
	}

	
	
}
