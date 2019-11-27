package co.budgetize.budgetize.dao;

import co.budgetize.budgetize.models.Expense;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface ExpenseDao extends CrudRepository<Expense, Long> {
}