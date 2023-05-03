public void save(Produto produto) {
	EntityManagerFactory factory = 	Persistence.createEntityManagerFactory("magazine-senai");
	EntityManager em = factory.createEntityManager();

	em.getTransaction().begin();

	em.persist(produto);

	em.getTransaction().commit();
	em.close;
}
