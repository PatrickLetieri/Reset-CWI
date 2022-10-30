/// <reference types="cypress" />

// Declara uma test suite
describe('Tela about us', () =>{
    
    //O before executa apenas uma vez 
    before(() => {
        cy.log('before')
    })

    //O beforeEach roda antes de cada teste
    beforeEach(() => {
        //Entra no site
        cy.visit('http://automationpractice.com/index.php')
    })

    it('Acessar about us', () => {
        
        cy.get('a[title="About us"]').click()
        cy.get('h1.page-heading').should('have.text', 'About us')
    })
})