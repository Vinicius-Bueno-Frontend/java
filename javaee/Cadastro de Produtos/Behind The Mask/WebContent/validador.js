/**
 * Validador novo.jsp
 */

function validar() {
	let nomeproduto = frmNovo.nomeproduto.value
	let descricao = frmNovo.descricao.value
	let preco = frmNovo.preco.value
	let tamanho = frmNovo.tamanho.value
	let genero = frmNovo.genero.value
	let situacao = frmNovo.situacao.value
	if (nomeproduto === ""){
		alert('Preencha o campo Nome do Produto')
		frmNovo.nomeproduto.focus()
		return false
	} else if  (descricao === "") {
		alert('Preencha o campo Descrição')
		frmNovo.descricao.focus()
		return false
	} else if  (preco === "") {
		alert('Preencha o campo Preço')
		frmNovo.preco.focus()
		return false
	} else if  (tamanho === "") {
		alert('Preencha o campo Tamanho')
		frmNovo.tamanho.focus()
		return false
	} else if  (genero === "") {
		alert('Preencha o campo Gênero')
		frmNovo.genero.focus()
		return false	
	} else if  (situacao === "") {
		alert('Preencha o campo Situação')
		frmNovo.situacao.focus()
		return false	
	} else {
		document.forms["frmNovo"].submit()
	}
}

