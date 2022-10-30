/// <reference types="cypress" />

describe('Valida o envio de mensagem através da página contact us', () =>{
    
    beforeEach(() => {
        cy.visit('http://automationpractice.com/index.php')
        cy.get('a[title="Contact Us"]')
            .click()
    })

    it('envio de mensagem inválido', () => {
        cy.get('select')
            .select('Customer service')
        cy.get('#email')
            .type('emailkkkkkk')
        cy.get('#id_order')
            .type('123')
        cy.get("#message")
            .type("teste")
        cy.get('#submitMessage')
            .click()
        cy.get('.alert li').should('contain.text', 'Invalid email address.')
    })

    it('envio de mensagem válido', () => {
        cy.get('select')
            .select('Customer service')
        cy.get('#email')
            .type('email@valido.com')
        cy.get("#message")
            .type("teste")
        cy.get('#submitMessage')
            .click()
        cy.get('.alert').should('have.text', 'Your message has been successfully sent to our team.')
    })
})