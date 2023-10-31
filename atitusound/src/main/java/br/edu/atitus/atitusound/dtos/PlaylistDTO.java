package br.edu.atitus.atitusound.dtos;

import java.util.UUID;

public class PlaylistDTO {
	
private UUID uuid;
	private String name;
	private boolean public_share;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isPublic_share() {
		return public_share;
	}
	public void setPublic_share(boolean public_share) {
		this.public_share = public_share;
	}
	public UUID getUuid() {
		return uuid;
	}
	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}
	
}
